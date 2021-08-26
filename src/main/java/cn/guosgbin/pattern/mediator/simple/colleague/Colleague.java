package cn.guosgbin.pattern.mediator.simple.colleague;

import cn.guosgbin.pattern.mediator.simple.meditator.Mediator;

/**
 * 抽象同事类
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 8:53
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
