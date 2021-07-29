package cn.guosgbin.pattern.singleton.solve;

/**
 * 饿汉-静态成员变量-静态代码块初始化-线程安全
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class CloneSingleton implements Cloneable{
    private static final CloneSingleton INSTANCE;

    static {
        try {
            INSTANCE = new CloneSingleton();
        } catch (Exception e) {
            throw new RuntimeException("创建单例实例发生异常");
        }
    }

    private CloneSingleton() { }

    public static CloneSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneSingleton s1 = CloneSingleton.getInstance();
        CloneSingleton s2 = (CloneSingleton) s1.clone();

        System.out.println("s1 == s2 ? " + (s1 == s2)); // false
        System.out.println("s1哈希值:" + s1.hashCode()); // 2133927002
        System.out.println("s2哈希值:" + s2.hashCode()); // 1452126962
    }
}
