package cn.guosgbin.pattern.composite.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/14 22:11
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class Component {
    protected String name;
    protected Integer level;

    public Component(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    // 增加 树叶或者树枝
    public abstract void add(Component component);
    // 移除 树叶或者树枝
    public abstract void remove(Component component);

    public abstract void show();
}
