package cn.guosgbin.pattern.proxy.simple.static_proxy;

import cn.guosgbin.pattern.proxy.simple.common.Person;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/19 23:51
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class client {
    public static void main(String[] args) {
        Person person = new Person();
        PersonProxy personProxy = new PersonProxy(person);
        personProxy.eat();
    }
}
