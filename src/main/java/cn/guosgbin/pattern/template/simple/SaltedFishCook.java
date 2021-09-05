package cn.guosgbin.pattern.template.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 20:04
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class SaltedFishCook extends AbstarctCook {
    public SaltedFishCook() {
        // 咸鱼不用放盐
        super(false);
    }

    @Override
    public void ingredients() {
        System.out.println("加咸鱼一条...");
    }
}
