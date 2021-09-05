package cn.guosgbin.pattern.template.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 19:55
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class AbstarctCook {
    /**
     * 是否需要放盐
     */
    private boolean needSalt = true;

    public AbstarctCook() {
    }

    public AbstarctCook(boolean needSalt) {
        this.needSalt = needSalt;
    }

    public final void cook() {
        // 倒油
        oil();
        // 加材料
        ingredients();
        // 是否需要加盐
        if (needSalt) {
            salt();
        }
        System.out.println("菜做好了...");
    }

    private void oil() {
        System.out.println("倒油...");
    }

    private void salt() {
        System.out.println("加点盐...");
    }

    /**
     * 具体放什么食材由子类决定
     */
    public abstract void ingredients();
}
