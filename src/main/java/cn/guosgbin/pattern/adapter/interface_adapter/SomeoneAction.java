package cn.guosgbin.pattern.adapter.interface_adapter;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/9 9:13
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class SomeoneAction extends BaseActionAdapter {
    @Override
    public void sing() {
        System.out.println("唱歌");
    }

    @Override
    public void dance() {
        System.out.println("跳舞");
    }
}
