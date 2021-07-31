package cn.guosgbin.pattern.factory.method.demo;

public class Client {

    public static void main(String[] args) {
        Computer desktop = ComputerFactory.getComputer(1, "64GB", "技嘉", "AMD");
        Computer laptop = ComputerFactory.getComputer(2, "16GB", "华硕", "Intel");
        System.out.println("台式机配置 -->> " + desktop);
        System.out.println("笔记本配置 -->> " + laptop);
    }

}