package cn.guosgbin.pattern.decorator.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/17 22:36
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        Animal person = new Person();
        person.assemble();

        System.out.println("==============");
        // 穿上裤子
        person = new Jeans(person);
        person.assemble();

        System.out.println("==============");
        // 穿上衣服
        person = new Shirt(person);
        person.assemble();

        System.out.println("==============");
        // 再穿一条裤子
        person = new Jeans(person);
        person.assemble();
    }
}
