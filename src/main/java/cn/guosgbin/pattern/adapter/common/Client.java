package cn.guosgbin.pattern.adapter.common;

import cn.guosgbin.pattern.adapter.class_adapter.VoltageAdapter;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/9 8:58
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        new Phone().charge(voltageAdapter);
    }
}
