package cn.guosgbin.pattern.strategy.activity.strategy;

import java.math.BigDecimal;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/2 23:58
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class VoucherStrategy implements Discount<BigDecimal>{

    /**
     * 直减券
     *
     * @param discount 直减金额
     * @param amount 原价
     */
    @Override
    public BigDecimal calculate(BigDecimal discount, BigDecimal amount) {
        BigDecimal subtract = amount.subtract(discount);
        if (subtract.compareTo(new BigDecimal(0)) < 0) {
            return new BigDecimal(0);
        }
        return subtract;
    }
}
