package cn.guosgbin.pattern.builder.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/6 8:45
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class House {
    private String base;
    private String wall;
    private String roof;
    private String swimmingPool;
}
