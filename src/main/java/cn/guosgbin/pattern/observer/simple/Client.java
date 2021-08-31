package cn.guosgbin.pattern.observer.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/29 22:02
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        StaffObserver staff01 = new StaffObserver("小赵");
        StaffObserver staff02 = new StaffObserver("小孙");
        StaffObserver staff03 = new StaffObserver("小炮");

        ReceptionSubject subject = new ReceptionSubject();
        subject.attach(staff01);
        subject.attach(staff02);
        subject.attach(staff03);

        subject.notify("老板来了，别摸鱼了");
    }
}
