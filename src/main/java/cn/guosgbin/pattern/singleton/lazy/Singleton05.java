package cn.guosgbin.pattern.singleton.lazy;

/**
 * 懒汉-同步代码块-线程不安全
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Singleton05 {
    private static Singleton05 INSTANCE;

    private Singleton05() { }

    public static Singleton05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton05.class) {
                INSTANCE = new Singleton05();
            }
        }
        return INSTANCE;
    }
}
