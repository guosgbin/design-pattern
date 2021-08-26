package cn.guosgbin.pattern.command.simple2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 点菜的额外参数
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/23 21:27
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@AllArgsConstructor
public class OrderParam {
    // 桌号
    private Integer tableNum;
    // 几份菜s
    private Integer num;
}
