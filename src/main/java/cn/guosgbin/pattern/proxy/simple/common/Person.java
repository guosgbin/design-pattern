package cn.guosgbin.pattern.proxy.simple.common;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/19 23:33
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Person implements Behavior {
    @Override
    public void eat() {
        System.out.println("人在吃饭");
    }
}
