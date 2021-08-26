package cn.guosgbin.pattern.command.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 22:44
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        Chef chef = new Chef();

        // 组装命令1
        Order order = new Order();
        order.setDiningTable(1);
        order.setFood("bullshit", 20);
        order.setFood("bullshit2", 10);
        OrderCommand orderCommand = new OrderCommand(chef, order);

        // 组装命令2
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("cow", 1);
        OrderCommand orderCommand2 = new OrderCommand(chef, order2);


        // 发送者发送命令
        Waiter waiter = new Waiter();
        waiter.setCommand(orderCommand);
        waiter.setCommand(orderCommand2);

        //
        waiter.orderUp();
    }
}
