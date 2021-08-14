package cn.guosgbin.pattern.adapter.common;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/9 8:50
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Phone {
    public void charge(ChargerVoltage5V charger) {
        int voltage = charger.output5V();
        if(voltage == 5){
            System.out.println("手机正在以" + voltage + "V电压充电...");
        } else {
            throw new UnsupportedOperationException("电压不正常");
        }
    }
}
