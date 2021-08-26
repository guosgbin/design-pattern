package cn.guosgbin.pattern.command.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 22:36
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Chef {
    public void makeFood(String name, int num) {
        System.out.println(num + "份" + name);
    }
}
