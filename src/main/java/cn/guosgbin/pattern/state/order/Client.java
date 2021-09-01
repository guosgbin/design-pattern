package cn.guosgbin.pattern.state.order;

import cn.guosgbin.pattern.state.order.cache.OrderStatusCache;
import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.experimental.var;

import java.math.BigDecimal;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/31 23:56
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    private static OrderStatusCache orderStatusCache = OrderStatusCache.getInstance();
    private static BaseOrderOperate orderOperate = new BaseOrderOperate();


    public static void main(String[] args) {
        Order order = initOrder(OrderStatusEnum.NEW);

        orderOperate.pay(order);
        System.out.println("当前订单状态:" + orderStatusCache.getOrderStatus(order.getId()));

        orderOperate.appeal(order);
        System.out.println("当前订单状态:" + orderStatusCache.getOrderStatus(order.getId()));

        orderOperate.cancel(order);
        System.out.println("当前订单状态:" + orderStatusCache.getOrderStatus(order.getId()));

//        orderOperate.release(order);
//        System.out.println("当前订单状态:" + orderStatusCache.getOrderStatus(order.getId()));


    }

    /**
     * 模拟初始化订单
     */
    private static Order initOrder(OrderStatusEnum status) {
        Order order = new Order();
        order.setId(123456789L);
        order.setAmount(new BigDecimal(100));
        order.setBuyerUid(10086L);
        order.setSellerUid(10000L);
        order.setStatus(status);
        OrderStatusCache.getInstance().setOrderStatus(order.getId(), status.getStatus());
        return order;
    }
}
