package cn.guosgbin.pattern.mediator.simple;

import cn.guosgbin.pattern.mediator.simple.colleague.Colleague01;
import cn.guosgbin.pattern.mediator.simple.colleague.Colleague02;
import cn.guosgbin.pattern.mediator.simple.meditator.ConcreteMediator;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 9:02
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        // 具体中介者
        ConcreteMediator concreteMediator = new ConcreteMediator();
        // 让同事类知晓中介者
        Colleague01 c01 = new Colleague01(concreteMediator);
        Colleague02 c02 = new Colleague02(concreteMediator);
        // 将中介者知晓同事类
        concreteMediator.setColleague01(c01);
        concreteMediator.setColleague02(c02);

        // 调用同事类方法
        c01.depMethod();
        System.out.println("==========");

        c02.depMethod();
    }
}
