package cn.guosgbin.principle.LSP.feature;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dylan kwok GSGB
 * @date: 2023/2/12 15:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 *
 * 遵守里氏替换原则
 */
public class SubClassReturnStrictObserve {
    public static void main(String[] args) {
        B b = new B();
        ArrayList list = new ArrayList();
        b.method();
    }

    static abstract class A {
        // 父类的方法返回值是 List
        public abstract List method();
    }

    static class B extends A {
        // 方法重写，返回值是 ArrayList 类型，比父类 A 的返回值 List 更加严格
        @Override
        public ArrayList method() {
            System.out.println("子类的代码执行...");
            return new ArrayList();
        }
    }
}
