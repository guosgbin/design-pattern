package cn.guosgbin.pattern.state.order;

/**
 * 订单过渡状态
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/30 23:34
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public enum OrderStatusEnum {
    NEW(1, "待付款"),
    PAY(2, "已付款"),
    CANCEL(3, "取消订单"),
    APPEAL(4, "申诉中"),
    SUCCESS(5,"成功"),
    APPEAL_SUCCESS(6, "申诉交易成功"),
    APPEAL_CANCEL(7, "申诉交易取消"),
    ;


    private Integer status;
    private String desc;

    OrderStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
