package cn.guosgbin.pattern.builder.demo2;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/6 8:47
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract HouseBuilder appendBase();
    public abstract HouseBuilder appendWall();
    public abstract HouseBuilder appendRoof();
    public abstract HouseBuilder appendSwimmingPool();

    public House getHouse() {
        return house;
    }
}
