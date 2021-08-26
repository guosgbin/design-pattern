package cn.guosgbin.pattern.mediator.simple.colleague;

import cn.guosgbin.pattern.mediator.simple.meditator.Mediator;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 8:53
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Colleague01 extends Colleague{
    public Colleague01(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod() {
        System.out.println("同事1的自身行为");
    }

    public void depMethod() {
        System.out.println("同事1的依赖行为");
        super.mediator.doSomething01();
    }
}
