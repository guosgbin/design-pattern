package cn.guosgbin.pattern.command.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 22:33
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Order {
    // 餐桌号码
    private int diningTable;
    //
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
