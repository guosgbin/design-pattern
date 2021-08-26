package cn.guosgbin.pattern.mediator.simple.meditator;

import cn.guosgbin.pattern.mediator.simple.colleague.Colleague01;
import cn.guosgbin.pattern.mediator.simple.colleague.Colleague02;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 8:58
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseMediator implements Mediator {
    protected Colleague01 colleague01;
    protected Colleague02 colleague02;
}
