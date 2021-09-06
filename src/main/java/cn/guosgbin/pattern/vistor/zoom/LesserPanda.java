package cn.guosgbin.pattern.vistor.zoom;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 23:10
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class LesserPanda extends Animal{

    public LesserPanda(String color, Boolean eat, Boolean healthy) {
        super(color, eat, healthy);
    }

    // 游客关注的
    public void info() {
        System.out.println("小熊猫的颜色是: " + color);
        System.out.println("小熊猫在睡觉");
    }

    // 饲养员关注的
    public void breederInfo() {
        System.out.println("小熊猫是否进食: " + eat);
        System.out.println("小熊猫是否健康:" + healthy );
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
