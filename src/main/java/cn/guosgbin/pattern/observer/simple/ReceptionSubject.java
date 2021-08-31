package cn.guosgbin.pattern.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/29 21:59
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class ReceptionSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String msg) {
        System.out.println(msg);
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
