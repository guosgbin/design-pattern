package cn.guosgbin.pattern.template.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/5 22:11
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        SaltedFishCook saltedFishCook = new SaltedFishCook();
        // 炒咸鱼
        saltedFishCook.cook();
        System.out.println("=========");
        CabbageCook cabbageCook = new CabbageCook();
        // 炒包菜
        cabbageCook.cook();
    }
}
