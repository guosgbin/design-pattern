package cn.guosgbin.container.context.support;

import cn.guosgbin.container.beans.BeanDefinition;
import cn.guosgbin.container.beans.factory.support.BeanDefinitionReader;
import cn.guosgbin.container.beans.factory.support.BeanDefinitionRegistry;
import cn.guosgbin.container.context.ApplicationContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ApplicationContext的子实现类，用于立即加载
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 21:37
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    // 解析器
    protected BeanDefinitionReader beanDefinitionReader;
    // bean对象容器
    protected Map<String, Object> singletonObjects = new ConcurrentHashMap<>(16);
    // 配置文件路径的变量
    protected String configLocation;

    /**
     * 相当于模板方法，具体的beanDefinitionReader对象由子类去定义。
     */
    @Override
    public void refresh() throws IllegalStateException, Exception {
        // 加载BeanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        finishBeanInitialization();
    }

    /**
     * bean对象的初始化
     */
    private void finishBeanInitialization() throws Exception {
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        String[] beanNames = registry.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            this.getBean(beanName);
        }

    }
}
