package cn.guosgbin.pattern.interpreter.calculate;

/**
 * 加法
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/6 23:15
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Addition extends NonTerminalExpression {
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Context context) {
        // 将左边表达式的结果和右边表达式的结果相加
        return left.interpreter(context) + right.interpreter(context);
    }

    @Override
    public String toString() {
        return "(" + left + "+" + right + ")";
    }
}
