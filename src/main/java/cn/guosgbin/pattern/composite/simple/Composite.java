package cn.guosgbin.pattern.composite.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/14 22:15
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name, Integer level) {
        super(name, level);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void show() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component c : children) {
            c.show();
        }
    }
}
