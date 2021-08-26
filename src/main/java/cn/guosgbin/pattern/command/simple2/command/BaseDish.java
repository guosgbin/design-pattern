package cn.guosgbin.pattern.command.simple2.command;

import cn.guosgbin.pattern.command.simple2.OrderParam;
import cn.guosgbin.pattern.command.simple2.receiver.Chef;

/**
 * 基础命令类
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/23 21:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class BaseDish implements Dish {
    // 接收者
    protected Chef chef;

    // 命令类的额外参数
    protected OrderParam orderParam;

    public BaseDish(Chef chef, OrderParam orderParam) {
        this.chef = chef;
        this.orderParam = orderParam;
    }
}
