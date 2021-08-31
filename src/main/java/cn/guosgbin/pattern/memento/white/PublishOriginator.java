package cn.guosgbin.pattern.memento.white;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发起人
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 23:50
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublishOriginator {
    // 发起者的内部状态
    private PublishInfo publishInfo;

    // 备份
    public PublishMemento savePublishInfo() {
        return new PublishMemento(this.publishInfo);
    }

    // 恢复
    public void restorePulishInfo(PublishMemento publishMemento) {
        this.publishInfo = publishMemento.getPublishInfo();
    }
}
