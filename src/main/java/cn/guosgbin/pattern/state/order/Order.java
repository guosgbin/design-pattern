package cn.guosgbin.pattern.state.order;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {
    /**
     * 卖家UID
     */
    private Long sellerUid;

    /**
     * 买家UID
     */
    private Long buyerUid;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 订单状态
     */
    private OrderStatusEnum status;
}
