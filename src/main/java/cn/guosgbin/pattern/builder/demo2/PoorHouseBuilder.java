package cn.guosgbin.pattern.builder.demo2;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/8 21:07
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class PoorHouseBuilder extends HouseBuilder{

    @Override
    public HouseBuilder appendBase() {
        house.setBase("泥巴地基");
        return this;
    }

    @Override
    public HouseBuilder appendWall() {
        house.setWall("木头墙");
        return this;
    }

    @Override
    public HouseBuilder appendRoof() {
        house.setRoof("茅草屋顶");
        return this;
    }

    @Override
    public HouseBuilder appendSwimmingPool() {
        return this;
    }
}
