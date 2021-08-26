package cn.guosgbin.pattern.mediator.simple.colleague;

import cn.guosgbin.pattern.mediator.simple.meditator.Mediator;

public class Colleague02 extends Colleague {
    public Colleague02(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod() {
        System.out.println("同事2的自身行为");
    }

    public void depMethod() {
        System.out.println("同事2的依赖行为");
        super.mediator.doSomething02();
    }
}
