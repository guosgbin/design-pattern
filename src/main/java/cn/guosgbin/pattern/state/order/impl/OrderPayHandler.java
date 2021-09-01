package cn.guosgbin.pattern.state.order.impl;

import cn.guosgbin.pattern.state.order.Order;
import cn.guosgbin.pattern.state.order.OrderOperate;
import cn.guosgbin.pattern.state.order.OrderStatusEnum;
import cn.guosgbin.pattern.state.order.cache.OrderStatusCache;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/31 23:19
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class OrderPayHandler implements OrderOperate {
    private OrderStatusCache orderStatusCache = OrderStatusCache.getInstance();

    @Override
    public void pay(Order order) {
        log.debug("已付款状态不能付款, order info = {}", JSONObject.toJSONString(order));
        throw new UnsupportedOperationException("已付款状态不能付款");
    }

    @Override
    public void cancel(Order order) {
        log.debug("开始取消订单, order info = {}", JSONObject.toJSONString(order));
        order.setStatus(OrderStatusEnum.CANCEL);
        orderStatusCache.setOrderStatus(order.getId(), OrderStatusEnum.CANCEL.getStatus());
    }

    @Override
    public void appeal(Order order) {
        log.debug("付款状态开始申诉, order info = {}", JSONObject.toJSONString(order));
        order.setStatus(OrderStatusEnum.APPEAL);
        orderStatusCache.setOrderStatus(order.getId(), OrderStatusEnum.APPEAL.getStatus());
    }

    @Override
    public void release(Order order) {
        log.debug("付款状态开始放行订单, order info = {}", JSONObject.toJSONString(order));
        order.setStatus(OrderStatusEnum.SUCCESS);
        orderStatusCache.setOrderStatus(order.getId(), OrderStatusEnum.SUCCESS.getStatus());
    }

    @Override
    public OrderStatusEnum getCurrentStatus(Order order) {
        return OrderStatusEnum.PAY;
    }
}
