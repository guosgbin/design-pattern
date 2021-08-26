package cn.guosgbin.pattern.command.simple2.receiver;

/**
 * 接收者
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/23 21:19
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Chef {
    // 厨师做菜，也就是对应了 接收者处理命令
    void action(Integer num);
}
