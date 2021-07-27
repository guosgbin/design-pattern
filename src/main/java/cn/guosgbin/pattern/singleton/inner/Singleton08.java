package cn.guosgbin.pattern.singleton.inner;

/**
 * 静态内部类-线程安全
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/27 8:36
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Singleton08 {
    private Singleton08() { }

    private static class SingletonHolder {
        private static final Singleton08 INSTANCE = new Singleton08();
    }

    public static Singleton08 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
