package cn.guosgbin.pattern.memento.white;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 23:51
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublishMemento {
    // 备忘录保存
    private PublishInfo publishInfo;

}
