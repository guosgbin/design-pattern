package cn.guosgbin.pattern.decorator.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/17 22:28
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class AnimalDecorator implements Animal {
    protected Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }
}
