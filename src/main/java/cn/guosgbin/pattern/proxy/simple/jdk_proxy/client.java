package cn.guosgbin.pattern.proxy.simple.jdk_proxy;

import cn.guosgbin.pattern.proxy.simple.common.Behavior;
import cn.guosgbin.pattern.proxy.simple.common.Person;

import java.lang.reflect.Proxy;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/19 23:51
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class client {
    public static void main(String[] args) {
        Person person = new Person();

        ClassLoader classLoader = Person.class.getClassLoader();
        Class<?>[] interfaces = Person.class.getInterfaces();
        Behavior personProxy = (Behavior) Proxy.newProxyInstance(classLoader, interfaces, new PersonProxyHandler(person));
        personProxy.eat();
    }
}
