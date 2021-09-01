package cn.guosgbin.pattern.state.order;

import cn.guosgbin.pattern.state.order.cache.OrderStatusCache;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/1 8:11
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class BaseOrderOperate implements OrderOperate{
    private OrderStatusCache orderStatusCache = OrderStatusCache.getInstance();

    public OrderOperate getOrderOperate(Long id) {
        Integer orderStatus = orderStatusCache.getOrderStatus(id);
        return OrderStatusManager.getOrderOperate(orderStatus);
    }

    @Override
    public void pay(Order order) {
        OrderOperate orderOperate = getOrderOperate(order.getId());
        orderOperate.pay(order);
    }

    @Override
    public void cancel(Order order) {
        OrderOperate orderOperate = getOrderOperate(order.getId());
        orderOperate.cancel(order);
    }

    @Override
    public void appeal(Order order) {
        OrderOperate orderOperate = getOrderOperate(order.getId());
        orderOperate.appeal(order);
    }

    @Override
    public void release(Order order) {
        OrderOperate orderOperate = getOrderOperate(order.getId());
        orderOperate.release(order);
    }

    @Override
    public OrderStatusEnum getCurrentStatus(Order order) {
        OrderOperate orderOperate = getOrderOperate(order.getId());
        return orderOperate.getCurrentStatus(order);
    }
}
