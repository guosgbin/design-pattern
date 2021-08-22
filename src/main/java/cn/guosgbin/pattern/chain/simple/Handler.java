package cn.guosgbin.pattern.chain.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/22 14:33
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Handler {
    // 设置
    void setNextHandler(Handler nextHandler);

    // 处理请求的模板
    void process(Request request);
}
