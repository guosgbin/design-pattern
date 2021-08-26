package cn.guosgbin.pattern.command.simple2.command;

import cn.guosgbin.pattern.chain.simple.BaseHandler;
import cn.guosgbin.pattern.command.simple2.OrderParam;
import cn.guosgbin.pattern.command.simple2.receiver.Chef;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/23 21:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class EDish extends BaseDish {

    public EDish(Chef chef, OrderParam orderParam) {
        super(chef, orderParam);
    }

    @Override
    public void execute() {
        Integer tableNum = orderParam.getTableNum();
        Integer num = orderParam.getNum();
        log.debug("桌号：" + tableNum + ", 份数" + num);
        // 交给真正的 接收者 去执行
        chef.action(num);
    }
}
