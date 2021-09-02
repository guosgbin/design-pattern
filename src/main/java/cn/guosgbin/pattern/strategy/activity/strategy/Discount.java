package cn.guosgbin.pattern.strategy.activity.strategy;

import java.math.BigDecimal;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/2 23:51
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Discount<T> {
    /**
     * 计算折算后的金额
     *
     * @param param 额外参数
     * @param amount 原价
     */
    BigDecimal calculate(T param, BigDecimal amount);
}
