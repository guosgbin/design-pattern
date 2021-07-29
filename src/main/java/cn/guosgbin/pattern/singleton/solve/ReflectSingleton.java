package cn.guosgbin.pattern.singleton.solve;

/**
 * 饿汉-静态成员变量-线程安全
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class ReflectSingleton {
    private static final ReflectSingleton INSTANCE = new ReflectSingleton();

    private ReflectSingleton() {
        if(INSTANCE != null){
            throw new RuntimeException("重复创建单例对象");
        }
    }

    public static ReflectSingleton getInstance() {
        return INSTANCE;
    }
}
