package cn.guosgbin.pattern.command.simple2.invoker;

import cn.guosgbin.pattern.command.simple2.command.Dish;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/23 21:45
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class Waiter {

    private List<Dish> dishList = new ArrayList<>();

    public void add(Dish dish) {
        this.dishList.add(dish);
    }

    public void orderUp() {
        log.debug("美女服务员: 新订单来了......");
        for (Dish dish : dishList) {
            if (dish != null) {
                dish.execute();
            }
        }
    }
}
