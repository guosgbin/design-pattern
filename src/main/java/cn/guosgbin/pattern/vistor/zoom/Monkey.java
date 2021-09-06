package cn.guosgbin.pattern.vistor.zoom;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 23:10
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Monkey extends Animal{

    public Monkey(String color, Boolean eat, Boolean healthy) {
        super(color, eat, healthy);
    }

    // 游客关注的
    public void info() {
        System.out.println("猴子的颜色是: " + color);
        System.out.println("猴子在爬树");
    }

    // 饲养员关注的
    public void breederInfo() {
        System.out.println("猴子是否进食: " + eat);
        System.out.println("猴子是否健康:" + healthy );
        System.out.println("引导猴群管理");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
