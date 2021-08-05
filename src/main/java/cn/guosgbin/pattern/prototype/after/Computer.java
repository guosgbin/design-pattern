package cn.guosgbin.pattern.prototype.after;

import lombok.Data;
import lombok.ToString;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/4 8:34
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@ToString
public class Computer implements Cloneable {
    // 电脑品牌
    private String brand;
    // 显示器
    private String monitor;
    // 内存
    private String memory;
    // 磁盘
    private String disk;

    @Override
    protected Computer clone() throws CloneNotSupportedException {
        return (Computer) super.clone();
    }
}
