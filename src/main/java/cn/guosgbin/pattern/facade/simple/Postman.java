package cn.guosgbin.pattern.facade.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/18 22:17
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Postman {

    public void send() {
        System.out.println("快递员处理寄快递");
    }

    public void receive() {
        System.out.println("快递员处理上门送快递");
    }
}
