package cn.guosgbin.pattern.strategy.activity;

import cn.guosgbin.pattern.strategy.activity.strategy.Discount;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/3 8:28
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        // 打折券
        Discount discountStrategy = StrategyManager.getDiscountStrategy(CouponTypeEnum.DISCOUT.getType());
        BigDecimal discountAmount = discountStrategy.calculate(new BigDecimal("0.85"), new BigDecimal(108));
        System.out.println(discountAmount);

        // 满减
        Map<String, BigDecimal> param = new HashMap<>();
        // 满99-10
        param.put("threshold", new BigDecimal(99));
        param.put("discount", new BigDecimal(10));
        Discount couponStrategy = StrategyManager.getDiscountStrategy(CouponTypeEnum.COUPON.getType());
        BigDecimal couponAmount = couponStrategy.calculate(param, new BigDecimal(101));
        System.out.println(couponAmount);

        // 无门槛券
        Discount voucherStrategy = StrategyManager.getDiscountStrategy(CouponTypeEnum.VOUCHER.getType());
        BigDecimal voucherAmount = voucherStrategy.calculate(new BigDecimal("20"), new BigDecimal(122));
        System.out.println(voucherAmount);
    }
}
