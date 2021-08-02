package cn.guosgbin.pattern.factory.method.demo;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/7/30 9:00
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class ComputerFactory {
    public static Computer getComputer(Integer type, String memory, String mainboard, String cpu) {
        if (type == 1) {
            return new DesktopComputer(memory, mainboard, cpu);
        } else if (type == 2) {
            return new Laptop(memory, mainboard, cpu);
        }
        return null;
    }
}
