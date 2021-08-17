package cn.guosgbin.pattern.composite.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/14 22:18
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    /**
     *         root
     *         / \
     *        A1  A2
     *            /  \
     *           A21 A22
     *          /
     *         A211
     */
    public static void main(String[] args) {
        Component root = new Composite("root", 1);

        Leaf a1 = new Leaf("A1", 2);
        Composite a2 = new Composite("A2", 2);
        root.add(a1);
        root.add(a2);

        Composite a21 = new Composite("A21", 3);
        Leaf a22 = new Leaf("A22", 3);
        a2.add(a21);
        a2.add(a22);

        Leaf a211 = new Leaf("A221", 4);
        a21.add(a211);

        root.show();
    }
}
