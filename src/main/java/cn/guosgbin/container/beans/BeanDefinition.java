package cn.guosgbin.container.beans;

import lombok.Data;

/**
 * 用来封装bean标签属性
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 8:31
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
public class BeanDefinition {
    // id属性
    private String id;
    // class属性
    private String className;
    // property标签
    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }
}
