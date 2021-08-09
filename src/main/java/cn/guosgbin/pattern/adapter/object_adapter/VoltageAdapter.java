package cn.guosgbin.pattern.adapter.object_adapter;

import cn.guosgbin.pattern.adapter.common.ChargerVoltage5V;
import cn.guosgbin.pattern.adapter.common.Voltage220V;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/9 8:55
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class VoltageAdapter implements ChargerVoltage5V {
    // 通过组合
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int srcV = voltage220V.output220V();
        // 转成5V的电压
        int dstV = srcV / 44;
        System.out.println("适配器获得220V电压，输出" + dstV + "V电压...");
        return dstV;
    }
}
