package cn.guosgbin.container.context.support;

import cn.guosgbin.container.beans.BeanDefinition;
import cn.guosgbin.container.beans.MutablePropertyValues;
import cn.guosgbin.container.beans.PropertyValue;
import cn.guosgbin.container.beans.factory.support.BeanDefinitionRegistry;
import cn.guosgbin.container.beans.factory.xml.XmlBeanDefinitionReader;
import cn.guosgbin.container.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * IOC容器的具体子实现类
 * 用于加载类路径下的xml格式的配置文件
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 21:47
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        // 赋值beanDefinitionReader，不同的Reader解析器
        this.beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            // 加载配置文件，将beanDefinition注册到注册表
            // 根据反射创建对象到singletonObjects中
            this.refresh();
        } catch (Exception ignored) {
        }
    }

    /**
     * 根据bean对象的名称获取bean对象
     * @param name
     * @return
     * @throws Exception
     */
    @Override
    public Object getBean(String name) throws Exception {
        // 判断容器中是否已经存在该bean，存在直接放回，不存在就创建一个
        Object obj = singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        String className = beanDefinition.getClassName();
        Class<?> clazz = Class.forName(className);
        log.debug("className = {}, clazz = {}", className, clazz);
        Object beanObj = clazz.newInstance();

        // 进行依赖注入
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            String propertyName = propertyValue.getName();
            String ref = propertyValue.getRef();
            String value = propertyValue.getValue();
            if (ref != null && !Objects.equals("", ref)) {
                // 获取依赖的bean
                Object bean = getBean(ref);
                // 获取要注入的bean对象的set方法名称
                String setterName = StringUtils.getSetterMethodNameByField(propertyName);
                // 找到set方法，注入对象
                for (Method method : clazz.getMethods()) {
                    String methodName = method.getName();
                    if (Objects.equals(methodName, setterName)) {
                        // 执行set方法
                        method.invoke(beanObj, bean);
                    }
                }
            }

            if (value != null && !Objects.equals("", value)) {
                // 获取要注入的bean对象的set方法名称
                String setterName = StringUtils.getSetterMethodNameByField(propertyName);
                Method method = clazz.getMethod(setterName, String.class);
                method.invoke(beanObj, value);
            }
        }

        singletonObjects.put(name, beanObj);
        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean == null) {
            return null;
        }
        return clazz.cast(bean);
    }
}
