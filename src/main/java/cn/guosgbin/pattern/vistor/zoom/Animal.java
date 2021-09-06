package cn.guosgbin.pattern.vistor.zoom;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 23:06
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class Animal {
    // 颜色
    protected String color;
    // 是否进食
    protected Boolean eat;
    // 是否健康
    protected Boolean healthy;

    public Animal(String color, Boolean eat, Boolean healthy) {
        this.color = color;
        this.eat = eat;
        this.healthy = healthy;
    }

    // 表示允许Visitor访问
    public abstract void accept(Visitor visitor);
}
