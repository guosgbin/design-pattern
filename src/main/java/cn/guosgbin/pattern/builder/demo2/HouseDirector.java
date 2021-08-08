package cn.guosgbin.pattern.builder.demo2;

import cn.guosgbin.pattern.builder.webdemo.Builder;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/8 21:09
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class HouseDirector {

    public void constructHouse(HouseBuilder builder) {
        builder.appendBase()
                .appendWall()
                .appendRoof()
                .appendSwimmingPool();
    }
}
