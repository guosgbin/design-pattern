package cn.guosgbin.principle.SRP.step3;

/**
 * @author: Dylan Kwok
 * @date: 2020/3/22 15:11
 */
public class SingleResponsibility03 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.landRun("三轮车");
        vehicle.AirRun("飞机");
        vehicle.WaterRun("冲锋艇");
    }
}

/**
 * 交通工具类
 */
class Vehicle2{
    // 陆地
    public void landRun(String vehicleName){
        System.out.println( vehicleName + "在陆地上跑...");
    }
    // 天空
    public void AirRun(String vehicleName){
        System.out.println( vehicleName + "在天空上跑...");
    }
    // 水路
    public void WaterRun(String vehicleName){
        System.out.println( vehicleName + "在水里跑...");
    }
}