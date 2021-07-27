package cn.guosgbin.pattern.singleton.cas;

import cn.guosgbin.pattern.singleton.CasSingletonTest;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS-线程安全-无锁实现-有缺陷
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Singleton07 {
    private static final AtomicReference<Singleton07> INSTANCE
            = new AtomicReference<>();

    private Singleton07() {
        System.out.println(Thread.currentThread().getName() + " -> Singleton07 被初始化了");
        CasSingletonTest.objectcount.getAndIncrement();
    }

    public static Singleton07 getInstance() {
        while (true) {
            Singleton07 singleton07 = INSTANCE.get();
            if (null != singleton07) {
                return singleton07;
            }
            singleton07 = new Singleton07();
            if (INSTANCE.compareAndSet(null, singleton07)) {
                return singleton07;
            }
        }
    }
}
