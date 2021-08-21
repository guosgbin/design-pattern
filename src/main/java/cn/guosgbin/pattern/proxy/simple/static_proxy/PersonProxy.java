package cn.guosgbin.pattern.proxy.simple.static_proxy;

import cn.guosgbin.pattern.proxy.simple.common.Behavior;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/19 23:35
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class PersonProxy implements Behavior {
    private Behavior behavior;

    public PersonProxy(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void eat() {
        before();
        behavior.eat();
        after();
    }

    private void after() {
        System.out.println("吃饭前准备工作");
    }

    private void before() {
        System.out.println("吃饭后收拾工作");
    }
}
