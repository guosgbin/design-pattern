package cn.guosgbin.pattern.interpreter.calculate;

/**
 * 减法
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/6 23:17
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Subtract extends NonTerminalExpression {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context) - right.interpreter(context);
    }

    @Override
    public String toString() {
        return "(" + left + "-" + right + ")";
    }
}

