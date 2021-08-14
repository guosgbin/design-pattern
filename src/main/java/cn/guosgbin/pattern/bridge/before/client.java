package cn.guosgbin.pattern.bridge.before;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/12 8:03
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class client {
    public static void main(String[] args) {
        new RedHuaweiPhone().call();
        new BlackHuaweiPhone().call();
    }
}
