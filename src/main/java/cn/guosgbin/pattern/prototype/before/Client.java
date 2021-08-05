package cn.guosgbin.pattern.prototype.before;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/4 8:38
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setBrand("联想");
        computer.setMonitor("京东方");
        computer.setDisk("西部数据");
        computer.setMemory("金士顿");

        System.out.println(computer);

        // 复制一个一模一样的电脑出来
        Computer computer2 = new Computer();
        computer2.setBrand("联想");
        computer2.setMonitor("京东方");
        computer2.setDisk("西部数据");
        computer2.setMemory("金士顿");

        System.out.println(computer2);

        System.out.println(computer == computer2); // false

    }
}
