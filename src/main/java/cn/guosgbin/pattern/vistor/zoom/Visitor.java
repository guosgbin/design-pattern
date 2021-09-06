package cn.guosgbin.pattern.vistor.zoom;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 23:05
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Visitor {
    void visit(Monkey monkey);
    void visit(LesserPanda lesserPanda);
}
