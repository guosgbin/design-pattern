package cn.guosgbin.pattern.state.order.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/31 23:27
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class OrderStatusCache {
    private Map<Long, Integer> orderStatusMap = new HashMap<>();

    private static final OrderStatusCache orderStatusCache = new OrderStatusCache();

    private OrderStatusCache() {
    }

    public static OrderStatusCache getInstance() {
        return orderStatusCache;
    }

    /**
     * 设置订单状态
     */
    public void setOrderStatus(Long id, Integer status) {
        orderStatusMap.put(id, status);
    }

    /**
     * 获得订单状态
     */
    public Integer getOrderStatus(Long id) {
        return orderStatusMap.get(id);
    }
}
