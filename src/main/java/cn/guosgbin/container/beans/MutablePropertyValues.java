package cn.guosgbin.container.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 用来存储和管理多个PropertyValue
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 8:14
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>(16);
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList != null) {
            this.propertyValueList = propertyValueList;
        } else {
            this.propertyValueList = new ArrayList<>(16);
        }
    }

    /**
     * 获取迭代器
     */
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

    /**
     * 获取所有的PropertyValue对象
     */
    public PropertyValue[] getPropertyValue() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    /**
     * 根据propertyName获得PropertyValue
     */
    public PropertyValue getPropertyValue(String propertyName) {
        List<PropertyValue> collect = propertyValueList.stream()
                .filter(propertyValue -> Objects.equals(propertyValue.getName(), propertyName))
                .collect(Collectors.toList());
        if (collect.isEmpty()) {
            return null;
        }
        return collect.get(0);
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    public MutablePropertyValues addPropertyValue(PropertyValue pv) {
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue currentPv = propertyValueList.get(i);
            if (Objects.equals(currentPv.getName(), pv.getName())) {
                propertyValueList.set(i, pv);
                return this;
            }
        }
        this.propertyValueList.add(pv);
        return this;
    }

    /**
     * 判断是否有指定值的对象
     */
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }
}
