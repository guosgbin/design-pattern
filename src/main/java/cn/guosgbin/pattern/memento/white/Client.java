package cn.guosgbin.pattern.memento.white;

import java.time.LocalDateTime;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 23:57
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("========开始========");
        PublishInfo info1 = PublishInfo.PublishInfoBuilder.getBuilder()
                .jarFile("jar包地址666666")
                .version("100")
                .publishTime(LocalDateTime.now().plusDays(-1)).build();

        PublishOriginator originator = new PublishOriginator();
        originator.setPublishInfo(info1);
        System.out.println(originator);

        System.out.println("========创建管理者，保存状态========");
        PublishCaretaker caretaker = new PublishCaretaker();
        caretaker.setPublishMemento(originator.savePublishInfo());

        System.out.println("========新版开始上线========");
        PublishInfo info2 = PublishInfo.PublishInfoBuilder.getBuilder()
                .jarFile("jar包地址888888")
                .version("101")
                .publishTime(LocalDateTime.now()).build();
        originator.setPublishInfo(info2);
        System.out.println(originator);

        System.out.println("========报错了开始回滚========");
        originator.restorePulishInfo(caretaker.getPublishMemento());

        System.out.println(originator);
    }
}
