package cn.guosgbin.pattern.facade.simple;

/**
 * 快递公司门面对象
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/18 22:19
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class ExpressCompany {
    // 快递员
    private Postman postman = new Postman();
    // 卡车司机
    private TruckDriver truckDriver = new TruckDriver();

    /**
     * 寄快递
     */
    public void send() {
        postman.send();
        truckDriver.drive();
        System.out.println("快递送到了");
    }

    /**
     * 取快递
     */
    public void receive() {
        truckDriver.drive();
        postman.receive();
        System.out.println("快递收到了");
    }
}
