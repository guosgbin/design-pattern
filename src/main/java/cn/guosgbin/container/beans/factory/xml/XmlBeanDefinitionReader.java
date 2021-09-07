package cn.guosgbin.container.beans.factory.xml;

import cn.guosgbin.container.beans.BeanDefinition;
import cn.guosgbin.container.beans.MutablePropertyValues;
import cn.guosgbin.container.beans.PropertyValue;
import cn.guosgbin.container.beans.factory.support.BeanDefinitionReader;
import cn.guosgbin.container.beans.factory.support.BeanDefinitionRegistry;
import cn.guosgbin.container.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 8:43
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        // 使用dom4j解析xml配置文件
        SAXReader reader = new SAXReader();
        InputStream inputStream = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        // 文档对象
        Document document = reader.read(inputStream);
        // 根元素对象
        Element rootElement = document.getRootElement();
        // bean标签下的所有元素
        List<Element> beanElements = rootElement.elements("bean");
        for (Element beanElement : beanElements) {
            // 获取ID属性
            String id = beanElement.attributeValue("id");
            // 获取class属性
            String className = beanElement.attributeValue("class");
            // 将id属性和class属性封装到BeanDefinition对象中
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);

            beanDefinition.setClassName(className);

            // 解析property标签
            MutablePropertyValues propertyValues = new MutablePropertyValues();
            List<Element> propertyElements = beanElement.elements("property");
            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                propertyValues.addPropertyValue(propertyValue);
            }
            beanDefinition.setPropertyValues(propertyValues);
            // 将封装好的beanDefinition注册到注册表中
            registry.registerBeanDefinition(id, beanDefinition);
        }
    }
}
