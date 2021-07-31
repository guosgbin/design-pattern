package cn.guosgbin.pattern.factory.method.after;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/7/31 8:46
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        WelfareController welfareController = new WelfareController();
        String result = welfareController.sendWelfare(12345L, 1);
        System.out.println(result);
    }
}
