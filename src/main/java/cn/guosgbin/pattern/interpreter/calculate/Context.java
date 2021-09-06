package cn.guosgbin.pattern.interpreter.calculate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/6 22:48
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Context {
    private Map<Expression, Integer> map = new HashMap<>();

    /**
     * 增加值
     */
    public void add(Expression expression, Integer value) {
        map.put(expression, value);
    }

    /**
     * 获取值
     */
    public Integer get(Expression expression) {
        return map.get(expression);
    }
}
