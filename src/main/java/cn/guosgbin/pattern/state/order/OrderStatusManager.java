package cn.guosgbin.pattern.state.order;

import cn.guosgbin.pattern.state.order.impl.*;

import java.util.HashMap;
import java.util.Map;

public class OrderStatusManager {
    private static Map<Integer, OrderOperate> orderOperateMap = new HashMap<>(8);

    static {
        orderOperateMap.put(OrderStatusEnum.NEW.getStatus(), new OrderNewHandler());
        orderOperateMap.put(OrderStatusEnum.PAY.getStatus(), new OrderPayHandler());
        orderOperateMap.put(OrderStatusEnum.CANCEL.getStatus(), new OrderCancelHandler());
        orderOperateMap.put(OrderStatusEnum.APPEAL.getStatus(), new OrderAppealHandler());
        orderOperateMap.put(OrderStatusEnum.SUCCESS.getStatus(), new OrderSuccessHandler());
        orderOperateMap.put(OrderStatusEnum.APPEAL_SUCCESS.getStatus(), new OrderAppealSuccessHandler());
        orderOperateMap.put(OrderStatusEnum.APPEAL_CANCEL.getStatus(), new OrderAppealCancelHandler());
    }

    public static OrderOperate getOrderOperate(Integer status) {
        return orderOperateMap.get(status);
    }
}
