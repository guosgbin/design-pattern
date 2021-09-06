package cn.guosgbin.pattern.interpreter.calculate;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/6 23:10
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class TerminalExpression implements Expression {
    /**
     * 变量名称
     */
    private String name;

    public TerminalExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpreter(Context context) {
        // 获取当前终结表达式的值
        return context.get(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
