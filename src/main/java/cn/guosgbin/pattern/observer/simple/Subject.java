package cn.guosgbin.pattern.observer.simple;

/**
 * 被观察者
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/29 21:54
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Subject {
    // 增加观察者
    void attach(Observer observer);
    // 删除观察者
    void detach(Observer observer);
    // 通知观察者
    void notify(String msg);
}
