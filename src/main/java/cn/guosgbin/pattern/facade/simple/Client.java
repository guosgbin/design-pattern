package cn.guosgbin.pattern.facade.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/18 22:26
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        ExpressCompany company = new ExpressCompany();
        // 寄快递
        company.send();
        System.out.println("=============");
        // 拿快递
        company.receive();
    }
}
