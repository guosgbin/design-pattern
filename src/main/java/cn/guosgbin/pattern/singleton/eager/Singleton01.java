package cn.guosgbin.pattern.singleton.eager;

import java.io.Serializable;

/**
 * 饿汉-静态成员变量-线程安全
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Singleton01 implements Serializable {
    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() { }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
