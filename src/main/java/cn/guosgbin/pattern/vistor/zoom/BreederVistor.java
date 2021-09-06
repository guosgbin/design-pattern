package cn.guosgbin.pattern.vistor.zoom;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 23:18
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class BreederVistor implements Visitor {
    @Override
    public void visit(Monkey monkey) {
        System.out.println("饲养员开始访问猴子");
        monkey.breederInfo();
    }

    @Override
    public void visit(LesserPanda lesserPanda) {
        System.out.println("饲养员开始访问小熊猫");
        lesserPanda.breederInfo();
    }
}
