package cn.guosgbin.pattern.factory.conceptual.demo;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/2 8:51
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface ElectronicFactory {
    // 生产电脑
    Computer createComputer();

    // 生产手机
    Phone createPhone();
}

/**
 * 华为工厂
 */
class HuaweiFactory implements ElectronicFactory {

    @Override
    public Computer createComputer() {
        return new HuaweiComputer();
    }

    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}

/**
 * 小米工厂
 */
class XiaomiFactory implements ElectronicFactory {

    @Override
    public Computer createComputer() {
        return new XiaomiComputer();
    }

    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }
}

/**
 * 联想工厂
 */
class LenovoFactory implements ElectronicFactory {

    @Override
    public Computer createComputer() {
        return new LenovoComputer();
    }

    @Override
    public Phone createPhone() {
        return new LenovoPhone();
    }
}



