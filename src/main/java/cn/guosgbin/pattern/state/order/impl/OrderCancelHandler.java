package cn.guosgbin.pattern.state.order.impl;

import cn.guosgbin.pattern.state.order.Order;
import cn.guosgbin.pattern.state.order.OrderOperate;
import cn.guosgbin.pattern.state.order.OrderStatusEnum;
import cn.guosgbin.pattern.state.order.cache.OrderStatusCache;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/31 23:20
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class OrderCancelHandler implements OrderOperate {
    private OrderStatusCache orderStatusCache = OrderStatusCache.getInstance();

    @Override
    public void pay(Order order) {
        throw new UnsupportedOperationException("取消状态的订单不能付款");
    }

    @Override
    public void cancel(Order order) {
        throw new UnsupportedOperationException("取消状态的订单不能取消");

    }

    @Override
    public void appeal(Order order) {
        log.debug("取消状态订单开始申诉, order info = {}", JSONObject.toJSONString(order));
        order.setStatus(OrderStatusEnum.APPEAL);
        orderStatusCache.setOrderStatus(order.getId(), OrderStatusEnum.APPEAL.getStatus());
    }

    @Override
    public void release(Order order) {
        throw new UnsupportedOperationException("取消状态的订单不能放行");
    }

    @Override
    public OrderStatusEnum getCurrentStatus(Order order) {
        return OrderStatusEnum.CANCEL;
    }
}
