package cn.guosgbin.pattern.adapter.object_adapter;

import cn.guosgbin.pattern.adapter.common.Phone;
import cn.guosgbin.pattern.adapter.common.Voltage220V;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/10 8:29
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220V());
        new Phone().charge(voltageAdapter);
    }
}
