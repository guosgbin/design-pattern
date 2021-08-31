package cn.guosgbin.pattern.observer.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/29 22:00
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StaffObserver implements Observer {
    private String name;

    @Override
    public void update() {
        System.out.println(name + "接收到了消息, 暂停摸鱼...");
    }
}
