package cn.guosgbin.pattern.interpreter.calculate;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/6 23:20
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        // 定义容器
        Context context = new Context();

        // 定义终结表达式
        TerminalExpression terminalA = new TerminalExpression("a");
        TerminalExpression terminalB = new TerminalExpression("b");
        TerminalExpression terminalC = new TerminalExpression("c");
        TerminalExpression terminalD = new TerminalExpression("d");
        // 赋值
        context.add(terminalA, 1);
        context.add(terminalB, 2);
        context.add(terminalC, 3);
        context.add(terminalD, 4);

        // (a+(b-(c+d))) = -4
        Expression expression = new Addition(terminalA, new Subtract(terminalB, new Addition(terminalC, terminalD)));
        int result = expression.interpreter(context);
        System.out.println(expression);
        System.out.println(result);

        // a-((b-c)+d) = -2
        Expression expression2 = new Subtract(terminalA, new Addition(new Subtract(terminalB, terminalC), terminalD));
        System.out.println(expression2);
        System.out.println(expression2.interpreter(context));
    }
}
