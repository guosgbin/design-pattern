package cn.guosgbin.pattern.vistor.zoom;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 23:20
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class TouristVisitor implements Visitor {

    @Override
    public void visit(Monkey monkey) {
        System.out.println("游客开始访问猴子");
        monkey.info();
    }

    @Override
    public void visit(LesserPanda lesserPanda) {
        System.out.println("游客开始访问小熊猫");
        lesserPanda.info();
    }
}
