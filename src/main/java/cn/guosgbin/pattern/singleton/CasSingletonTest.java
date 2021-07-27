package cn.guosgbin.pattern.singleton;

import cn.guosgbin.pattern.singleton.cas.Singleton07;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CasSingletonTest {
    public static AtomicInteger objectcount = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch begin = new CountDownLatch(1);
        final CountDownLatch last = new CountDownLatch(1000);
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    begin.await();
//                    System.out.println(Thread.currentThread().getName() + ":begin...");
                    Singleton07 sba = Singleton07.getInstance();
//                    System.out.println(Thread.currentThread().getName() + ":OK");
                    last.countDown();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }).start();
        }
        begin.countDown();
        last.await();
        System.out.println("new objects: " + objectcount.get());
    }
}