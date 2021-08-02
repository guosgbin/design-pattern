package cn.guosgbin.pattern.factory.conceptual.demo;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/2 8:46
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class Computer {
    private String brand;

    public abstract String getBrand();

}

class HuaweiComputer extends Computer {

    @Override
    public String getBrand() {
        return "华为电脑";
    }
}

class XiaomiComputer extends Computer {
    @Override
    public String getBrand() {
        return "小米电脑";
    }

}

class LenovoComputer extends Computer {
    @Override
    public String getBrand() {
        return "联想电脑";
    }

}