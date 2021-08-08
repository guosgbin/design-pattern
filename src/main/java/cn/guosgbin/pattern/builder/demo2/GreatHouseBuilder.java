package cn.guosgbin.pattern.builder.demo2;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/8 20:59
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class GreatHouseBuilder extends HouseBuilder{

    @Override
    public HouseBuilder appendBase() {
        house.setBase("混凝土地基");
        return this;
    }

    @Override
    public HouseBuilder appendWall() {
        house.setWall("混凝土墙");
        return this;
    }

    @Override
    public HouseBuilder appendRoof() {
        house.setRoof("琉璃瓦");
        return this;
    }

    @Override
    public HouseBuilder appendSwimmingPool() {
        house.setSwimmingPool("豪华游泳池");
        return this;
    }
}
