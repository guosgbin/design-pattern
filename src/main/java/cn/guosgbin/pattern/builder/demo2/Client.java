package cn.guosgbin.pattern.builder.demo2;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/8 21:13
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        HouseBuilder greatBuilder = new GreatHouseBuilder();
        HouseBuilder poorBuilder = new PoorHouseBuilder();
        // 指挥者
        HouseDirector houseDirector = new HouseDirector();

        // 构造豪华房子
        houseDirector.constructHouse(greatBuilder);
        House greatHouse = greatBuilder.getHouse();
        System.out.println(greatHouse);

        // 构造差房子
        houseDirector.constructHouse(poorBuilder);
        House poorHouse = poorBuilder.getHouse();
        System.out.println(poorHouse);
    }
}
