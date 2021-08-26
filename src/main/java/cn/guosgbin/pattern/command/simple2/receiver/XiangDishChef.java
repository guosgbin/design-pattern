package cn.guosgbin.pattern.command.simple2.receiver;

import cn.guosgbin.pattern.command.simple2.receiver.Chef;
import lombok.extern.slf4j.Slf4j;

/**
 * 湘菜厨师
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/23 21:20
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class XiangDishChef implements Chef {
    @Override
    public void action(Integer num) {
        log.debug("湘菜厨师煮湘菜..." + num + "份");
    }
}
