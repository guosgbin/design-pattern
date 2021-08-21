package cn.guosgbin.pattern.proxy.simple.cglib_Proxy;

import cn.guosgbin.pattern.proxy.simple.common.Person;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/21 17:23
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        Person proxyObject = new PersonProxyFactory(person).getProxyObject();
        proxyObject.eat();
    }
}
