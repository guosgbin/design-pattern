package cn.guosgbin.pattern.chain.simple;

import javax.sound.midi.MidiFileFormat;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 15:08
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        Handler group = new Group();
        Handler manager = new Manager();
        Handler boss = new Boss();
        // 组长后面试经理
        group.setNextHandler(manager);
        // 经理后面试老板
        manager.setNextHandler(boss);
        // 创建请假请求
        Request request = new Request("赵磊", "肚子痛", 15);

        group.process(request);
    }
}
