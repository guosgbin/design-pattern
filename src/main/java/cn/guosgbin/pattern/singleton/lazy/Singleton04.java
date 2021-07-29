package cn.guosgbin.pattern.singleton.lazy;

/**
 * 懒汉-同步方法-线程安全
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Singleton04 {
    private static Singleton04 INSTANCE;

    private Singleton04() { }

    /**
     * 同步方法
     */
    public static synchronized Singleton04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton04();
        }
        return INSTANCE;
    }
}
