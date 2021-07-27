package cn.guosgbin.pattern.singleton.hungry;

/**
 * 饿汉-静态成员变量-静态代码块初始化-线程安全
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Singleton02 {
    private static final Singleton02 INSTANCE;

    static {
        try {
            INSTANCE = new Singleton02();
        } catch (Exception e) {
            throw new RuntimeException("创建单例实例发生异常");
        }
    }

    private Singleton02() { }

    public static Singleton02 getInstance() {
        return INSTANCE;
    }
}
