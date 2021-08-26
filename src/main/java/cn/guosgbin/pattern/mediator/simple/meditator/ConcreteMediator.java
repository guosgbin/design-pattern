package cn.guosgbin.pattern.mediator.simple.meditator;

/**
 * 具体中介者
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 9:01
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class ConcreteMediator extends BaseMediator{
    @Override
    public void doSomething01() {
        // 同事类的方法
        super.colleague01.selfMethod();
        super.colleague02.selfMethod();
    }

    @Override
    public void doSomething02() {
        super.colleague02.selfMethod();
        super.colleague01.selfMethod();
    }
}
