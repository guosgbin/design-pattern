package cn.guosgbin.container.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 8:12
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyValue {
    private String name;
    private String ref;
    // 给基本数据类型及String类型数据赋值
    private String value;
}
