package cn.guosgbin.pattern.factory.conceptual.demo;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/2 9:01
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        // 华为工厂
        ElectronicFactory huaweiFactory = new HuaweiFactory();
        // 小米工厂
        ElectronicFactory xiaomiFactory = new XiaomiFactory();
        // 联想工厂
        ElectronicFactory lenovoFactory = new LenovoFactory();

        System.out.println("===== 开始生产 =====");

        System.out.println("生产 -->> " + huaweiFactory.createComputer().getBrand());
        System.out.println("生产 -->> " + huaweiFactory.createPhone().getBrand());

        System.out.println("生产 -->> " + xiaomiFactory.createComputer().getBrand());
        System.out.println("生产 -->> " + xiaomiFactory.createPhone().getBrand());

        System.out.println("生产 -->> " + lenovoFactory.createComputer().getBrand());
        System.out.println("生产 -->> " + lenovoFactory.createPhone().getBrand());
    }
}
