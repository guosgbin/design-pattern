package cn.guosgbin.pattern.singleton;

import cn.guosgbin.pattern.singleton.cas.Singleton07;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试CAS创建多个对象的问题
 */
public class CasSingletonTest {
    public static AtomicInteger objectcount = new AtomicInteger();
    private static final CountDownLatch begin = new CountDownLatch(1);
    private static final CountDownLatch last = new CountDownLatch(1000);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    begin.await();
                    Singleton07 instance = Singleton07.getInstance();
                    last.countDown();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }).start();
        }
        begin.countDown();
        last.await();
        System.out.println("创建对象的次数: " + objectcount.get());
    }
}