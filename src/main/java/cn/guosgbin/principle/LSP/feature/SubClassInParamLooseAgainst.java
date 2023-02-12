package cn.guosgbin.principle.LSP.feature;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dylan kwok GSGB
 * @date: 2023/2/12 15:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 *
 * 违背了里氏替换原则
 */
public class SubClassInParamLooseAgainst {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        ArrayList list = new ArrayList();
        a.method(list);
        b.method(list);
    }

    static class A {
        // 父类的入参是 ArrayList
        public void method(List<String> list) {
            System.out.println("父类的代码执行...");
        }
    }

    static class B extends A {
        // 重载方法，子类的入参是 List 类型，比父类 A 的入参类型更宽松
        public void method(ArrayList<String> list) {
            System.out.println("子类的代码执行...");
        }
    }
}
