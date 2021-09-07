package cn.guosgbin.container.beans.factory.support;

import cn.guosgbin.container.beans.BeanDefinition;

/**
 * 注册表对象
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 8:34
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface BeanDefinitionRegistry {
    // 注册BeanDefinition到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    // 从注册表中移除指定名称的BeanDefinition
    void removeBeanDefinition(String beanName) throws Exception;

    // 根据名称获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    // 注册表中是否包含指定名称的BeanDefinition对象
    boolean containsBeanDefinition(String beanName);

    // 获取注册表中BeanDefinition对象的个数
    int getBeanDefinitionCount();

    // 获取注册表中所有BeanDefinition对象的名称
    String[] getBeanDefinitionNames();
}
