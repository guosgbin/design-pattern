package cn.guosgbin.principle.LSP.feature;

/**
 * @author: Dylan kwok GSGB
 * @date: 2023/2/12 15:19
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class SubClassNewMethodTest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println("父类的运行结果: " + a.method(1, 2));
        System.out.println("子类的运行结果: " +b.method(1, 2));
        b.newMethod();
    }

    static class A {
        public int method(int a, int b) {
            return a + b;
        }
    }

    static class B extends A {
       public void newMethod() {
           System.out.println("子类自定义的新方法");
       }
    }
}
