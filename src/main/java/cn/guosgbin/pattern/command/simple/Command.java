package cn.guosgbin.pattern.command.simple;

import java.util.Map;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 22:37
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Command {
    void execute();
}

class OrderCommand implements Command {
    // 持有接收者的对象
    private Chef receiver;
    //
    private Order order;

    public OrderCommand(Chef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "餐桌开始点餐");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (Map.Entry<String, Integer> entry : foodDir.entrySet()) {
            String name = entry.getKey();
            Integer num = entry.getValue();
            receiver.makeFood(name, num);
        }
        System.out.println(order.getDiningTable() + "桌的餐做好了");

    }
}
