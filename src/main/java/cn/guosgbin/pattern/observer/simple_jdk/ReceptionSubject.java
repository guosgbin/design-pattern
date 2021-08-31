package cn.guosgbin.pattern.observer.simple_jdk;

import cn.guosgbin.pattern.observer.simple.Observer;

import java.util.Observable;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/29 22:26
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class ReceptionSubject extends Observable {

    public void notifyObserver(String msg) {
        System.out.println(msg);
        super.setChanged();
        super.notifyObservers();
    }
}
