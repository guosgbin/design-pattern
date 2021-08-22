package cn.guosgbin.pattern.chain.simple;

import lombok.Data;

/**
 * 请求类
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 14:26
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
public class Request {
    private String name;
    private String reason;
    private Integer days;

    public Request(String name, String reason, Integer days) {
        this.name = name;
        this.reason = reason;
        this.days = days;
    }

    @Override
    public String toString() {
        return name + "申请请假" + days + ", 原因是" + reason;
    }
}
