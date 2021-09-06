package cn.guosgbin.pattern.vistor.zoom;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 23:20
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        // 创建动物
        Monkey monkey = new Monkey("黄色", true, true);
        LesserPanda lesserPanda = new LesserPanda("灰色", false, true);

        // 创建访问者
        BreederVistor breederVistor = new BreederVistor();
        TouristVisitor touristVisitor = new TouristVisitor();

        // 饲养员开始访问
        breederVistor.visit(monkey);
        breederVistor.visit(lesserPanda);
        System.out.println("==========华丽分割线==========");
        // 游客开始访问
        touristVisitor.visit(monkey);
        touristVisitor.visit(lesserPanda);
    }
}
