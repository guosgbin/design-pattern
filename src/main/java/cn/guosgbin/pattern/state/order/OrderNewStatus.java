package cn.guosgbin.pattern.state.order;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/31 8:49
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class OrderNewStatus implements OrderOperate {
    @Override
    public void pay(Order order) {
        log.debug("买方开始付款, buyer uid = {}", order.getBuyerUid());
        // 做一些付款操作
        order.setStatus(OrderStatusEnum.PAY);
        log.debug("买方付款完毕");
    }

    @Override
    public void cancel(Order order) {
        log.debug("开始取消付款");
        // 做一些取消操作
        order.setStatus(OrderStatusEnum.PAY);
        log.debug("买方付款完毕");
    }

    @Override
    public void appeal(Order order) {

    }

    @Override
    public void release(Order order) {

    }
}
