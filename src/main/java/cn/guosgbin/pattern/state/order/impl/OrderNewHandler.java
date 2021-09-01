package cn.guosgbin.pattern.state.order.impl;

import cn.guosgbin.pattern.state.order.Order;
import cn.guosgbin.pattern.state.order.OrderOperate;
import cn.guosgbin.pattern.state.order.OrderStatusEnum;
import cn.guosgbin.pattern.state.order.cache.OrderStatusCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/31 8:49
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class OrderNewHandler implements OrderOperate {

    private OrderStatusCache orderStatusCache = OrderStatusCache.getInstance();

    @Override
    public void pay(Order order) {
        log.debug("买方开始付款, buyer uid = {}", order.getBuyerUid());
        // 做一些付款操作
        order.setStatus(OrderStatusEnum.PAY);
        orderStatusCache.setOrderStatus(order.getId(), OrderStatusEnum.PAY.getStatus());
        log.debug("买方付款完毕");
    }

    @Override
    public void cancel(Order order) {
        log.debug("开始取消付款, order info = {}", JSONObject.toJSONString(order));
        // 做一些取消操作
        order.setStatus(OrderStatusEnum.CANCEL);
        orderStatusCache.setOrderStatus(order.getId(), OrderStatusEnum.CANCEL.getStatus());
        log.debug("买方付款完毕, order info = {}", JSONObject.toJSONString(order));
    }

    @Override
    public void appeal(Order order) {
        log.debug("未付款状态不能申诉, order info = {}", JSONObject.toJSONString(order));
        throw new UnsupportedOperationException("未付款状态不能申诉");
    }

    @Override
    public void release(Order order) {
        log.debug("未付款状态不能放行, order info = {}", JSONObject.toJSONString(order));
        throw new UnsupportedOperationException("未付款状态不能放行");

    }

    @Override
    public OrderStatusEnum getCurrentStatus(Order order) {
        return OrderStatusEnum.NEW;
    }
}
