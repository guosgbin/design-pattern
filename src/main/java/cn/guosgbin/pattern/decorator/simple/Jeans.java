package cn.guosgbin.pattern.decorator.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/17 22:35
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Jeans extends AnimalDecorator{

    public Jeans(Animal animal) {
        super(animal);
    }

    @Override
    public void assemble() {
        System.out.println("穿上牛仔裤");
        animal.assemble();
    }
}
