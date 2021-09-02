package cn.guosgbin.pattern.strategy.activity;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/2 22:46
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public enum  CouponTypeEnum {
    DISCOUT(1,"打折券"),
    COUPON(2,"满减券"),
    VOUCHER(3,"无门槛券"),
    ;


    private Integer type;
    private String desc;

    CouponTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
