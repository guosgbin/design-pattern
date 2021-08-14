package cn.guosgbin.pattern.bridge.after;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/12 8:32
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        new HuaweiPhone(new Black()).call();
        new HuaweiPhone(new Red()).call();

        new XiaomiPhone(new Black()).call();
    }
}
