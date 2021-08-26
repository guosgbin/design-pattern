package cn.guosgbin.pattern.command.simple2.receiver;

import cn.guosgbin.pattern.command.simple2.receiver.Chef;
import lombok.extern.slf4j.Slf4j;

/**
 * 接收者-鄂菜厨师
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/23 21:20
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class EDishChef implements Chef {
    @Override
    public void action(Integer num) {
        log.debug("鄂菜师傅煮鄂菜..." + num + "份");
    }
}
