package cn.guosgbin.pattern.interpreter.calculate;

/**
 * 抽象非终结符表达式
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/6 23:09
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class NonTerminalExpression implements Expression {
    protected Expression left;
    protected Expression right;

    public NonTerminalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
