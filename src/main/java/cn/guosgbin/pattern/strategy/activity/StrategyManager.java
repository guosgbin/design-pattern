package cn.guosgbin.pattern.strategy.activity;

import cn.guosgbin.pattern.strategy.activity.strategy.CouponStrategy;
import cn.guosgbin.pattern.strategy.activity.strategy.Discount;
import cn.guosgbin.pattern.strategy.activity.strategy.DiscountStrategy;
import cn.guosgbin.pattern.strategy.activity.strategy.VoucherStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/3 8:29
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class StrategyManager {
    private static final Map<Integer, Discount> discountMap = new HashMap<>();

    static {
        discountMap.put(CouponTypeEnum.DISCOUT.getType(), new DiscountStrategy());
        discountMap.put(CouponTypeEnum.COUPON.getType(), new CouponStrategy());
        discountMap.put(CouponTypeEnum.VOUCHER.getType(), new VoucherStrategy());
    }

    public static Discount getDiscountStrategy(Integer type) {
        return discountMap.get(type);
    }
}
