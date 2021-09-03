package cn.guosgbin.pattern.strategy.activity.strategy;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/2 23:56
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class CouponStrategy implements Discount<Map<String, BigDecimal>> {
    /**
     * 满减
     * @param param 满减参数
     *              key 金额, value 减少金额
     * @param amount 原价
     */
    @Override
    public BigDecimal calculate(Map<String, BigDecimal> param, BigDecimal amount) {
        // 满减阈值金额
        BigDecimal threshold = param.get("threshold");
        // 折扣金额
        BigDecimal discount = param.get("discount");
        if (amount.compareTo(threshold) >= 0) {
            return amount.subtract(discount);
        }
        return amount;
    }
}
