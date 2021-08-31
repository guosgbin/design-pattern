package cn.guosgbin.pattern.memento.black;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublishOriginator {
    // 发起者的内部状态
    private PublishInfo publishInfo;

    // 备份
    public Memento savePublishInfo() {
        return new PublishMemento(this.publishInfo);
    }

    // 恢复
    public void restorePulishInfo(Memento memento) {
        PublishMemento publishMemento = (PublishMemento) memento;
        this.publishInfo = publishMemento.getPublishInfo();
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private class PublishMemento implements Memento {
        // 备忘录保存
        private PublishInfo publishInfo;
    }
}