package cn.guosgbin.pattern.composite.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/14 22:13
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Leaf extends Component {

    public Leaf(String name, Integer level) {
        super(name, level);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void show() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
