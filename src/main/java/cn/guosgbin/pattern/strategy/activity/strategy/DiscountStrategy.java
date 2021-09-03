package cn.guosgbin.pattern.strategy.activity.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/2 23:54
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class DiscountStrategy implements Discount<BigDecimal>{

    /**
     * 打折
     *
     * @param discount 折扣
     * @param amount 原价
     */
    @Override
    public BigDecimal calculate(BigDecimal discount, BigDecimal amount) {
        return discount.multiply(amount).setScale(2, RoundingMode.HALF_UP);
    }
}
