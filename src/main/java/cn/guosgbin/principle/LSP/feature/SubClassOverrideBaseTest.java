package cn.guosgbin.principle.LSP.feature;

/**
 * @author: Dylan kwok GSGB
 * @date: 2023/2/12 15:10
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class SubClassOverrideBaseTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println("父类的运行结果: " + a.method(1, 2));
        System.out.println("子类替代父类后的运行结果: " +b.method(1, 2));
    }

    static class A {
        public int method(int a, int b) {
            return a + b;
        }
    }

    static class B extends A {
        @Override
        public int method(int a, int b) {
            return a - b;
        }
    }
}
