package cn.guosgbin.pattern.memento.black;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录的管理者
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 23:56
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublishCaretaker {
    private Memento memento;
}
