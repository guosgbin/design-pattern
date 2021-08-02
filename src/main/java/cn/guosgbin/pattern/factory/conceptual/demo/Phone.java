package cn.guosgbin.pattern.factory.conceptual.demo;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/2 8:49
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class Phone {
    private String brand;

    public abstract String getBrand();
}

class HuaweiPhone extends Phone {
    @Override
    public String getBrand() {
        return "华为手机";
    }
}

class XiaomiPhone extends Phone {
    @Override
    public String getBrand() {
        return "小米手机";
    }
}

class LenovoPhone extends Phone {
    @Override
    public String getBrand() {
        return "联想手机";
    }
} 
