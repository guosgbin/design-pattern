package cn.guosgbin.pattern.singleton;

import cn.guosgbin.pattern.singleton.hungry.Singleton01;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:27
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();

        System.out.println(instance == instance2);
    }
}
