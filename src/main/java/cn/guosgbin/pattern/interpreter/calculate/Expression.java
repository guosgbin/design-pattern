package cn.guosgbin.pattern.interpreter.calculate;

/**
 * 解释器接口
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/6 22:47
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Expression {
    // 解释方法，返回值为int是因为此案例只支持整型加减操作
    int interpreter(Context context);
}
