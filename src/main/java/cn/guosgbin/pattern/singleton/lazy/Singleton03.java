package cn.guosgbin.pattern.singleton.lazy;

/**
 * 懒汉-线程不安全
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;

    private Singleton03() { }

    public static Singleton03 getInstance() {
        if (INSTANCE != null) {
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }
}
