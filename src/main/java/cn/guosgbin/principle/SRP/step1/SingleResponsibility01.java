package cn.guosgbin.principle.SRP.step1;

/**
 * @author: Dylan Kwok
 * @date: 2020/3/22 15:11
 */
public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("三轮车");
        vehicle.run("飞机");
        vehicle.run("冲锋艇");
    }
}

/**
 * 交通工具类
 */
class Vehicle{
    // 成员方法run
    public void run(String vehicleName){
        System.out.println( vehicleName + "在路上跑...");
    }
}