package cn.guosgbin.pattern.bridge.after;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/12 8:28
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public abstract class Phone {
    // 持有Color的引用
    protected Color color;

    public Phone(Color color) {
        this.color = color;
    }

    // 打电话
    public abstract void call();
}

class HuaweiPhone extends Phone {

    public HuaweiPhone(Color color) {
        super(color);
    }

    @Override
    public void call() {
        String colorStr = color.applyColor();
        System.out.println(colorStr + " 华为手机打电话");
    }
}

class XiaomiPhone extends Phone {
    public XiaomiPhone(Color color) {
        super(color);
    }

    @Override
    public void call() {
        String colorStr = color.applyColor();
        System.out.println(colorStr + " 小米手机打电话");
    }
}