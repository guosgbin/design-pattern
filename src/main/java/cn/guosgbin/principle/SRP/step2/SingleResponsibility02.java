package cn.guosgbin.principle.SRP.step2;

/**
 * @author: Dylan Kwok
 * @date: 2020/3/22 15:11
 */
public class SingleResponsibility02 {
    public static void main(String[] args) {
        LandVehicle landVehicle = new LandVehicle();
        landVehicle.run("三轮车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("冲锋艇");
    }
}

/**
 * 陆地交通工具类
 */
class LandVehicle{
    // 成员方法run
    public void run(String vehicleName){
        System.out.println( vehicleName + "在陆地上跑...");
    }
}

/**
 * 水路交通工具类
 */
class WaterVehicle{
    // 成员方法run
    public void run(String vehicleName){
        System.out.println( vehicleName + "在水上跑...");
    }
}

/**
 * 水路交通工具类
 */
class AirVehicle{
    // 成员方法run
    public void run(String vehicleName){
        System.out.println( vehicleName + "在天上跑...");
    }
}