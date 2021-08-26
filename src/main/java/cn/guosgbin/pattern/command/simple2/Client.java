package cn.guosgbin.pattern.command.simple2;

import cn.guosgbin.pattern.command.simple2.command.Dish;
import cn.guosgbin.pattern.command.simple2.command.EDish;
import cn.guosgbin.pattern.command.simple2.command.XiangDish;
import cn.guosgbin.pattern.command.simple2.invoker.Waiter;
import cn.guosgbin.pattern.command.simple2.receiver.XiangDishChef;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/23 21:51
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        // 1号桌点一份湘菜
        OrderParam orderParam1 = new OrderParam(1, 1);
        Dish xiangDish = new XiangDish(new XiangDishChef(), orderParam1);

        // 2号桌点三份鄂菜
        OrderParam orderParam2 = new OrderParam(2, 3);
        Dish eDish = new EDish(new XiangDishChef(), orderParam2);

        // 服务员
        Waiter waiter = new Waiter();
        waiter.add(xiangDish);
        waiter.add(eDish);

        // 服务员发送请求给厨师做菜
        waiter.orderUp();
    }
}
