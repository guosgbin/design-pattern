package cn.guosgbin.pattern.command.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 22:41
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Waiter {

    // 持有对个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        // 将command对象存储到List集合中
        commands.add(command);
    }

    public void orderUp() {
        System.out.println("美女服务员，老板，新订单来了......");
        // 遍历List集合
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
