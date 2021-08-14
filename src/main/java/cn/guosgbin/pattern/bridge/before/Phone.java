package cn.guosgbin.pattern.bridge.before;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/12 7:52
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Phone {
    // 打电话
    void call();
}

class HuaweiPhone implements Phone{
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}

class BlackHuaweiPhone extends HuaweiPhone {
    @Override
    public void call() {
        System.out.print("黑色的华为手机, ");
        super.call();
    }
}

class RedHuaweiPhone extends HuaweiPhone {
    @Override
    public void call() {
        System.out.print("红色的华为手机, ");
        super.call();
    }
}
