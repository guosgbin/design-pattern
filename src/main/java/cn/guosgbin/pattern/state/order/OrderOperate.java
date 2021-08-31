package cn.guosgbin.pattern.state.order;

/**
 * 交易状态
 * 1.新建状态 -> 付款，取消
 * 2.已付款 -> 放行，取消，申诉
 * 3.取消状态 -> 申诉
 * 4.申诉中状态 -> 申诉，取消
 * 5.成功状态 -> 申诉
 *
 * 6.申诉交易成功状态 -> 申诉
 * 7.申诉交易失败状态 -> 申诉
 *
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/8/30 23:24
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface OrderOperate {
    // 付款
    void pay(Order order);

    // 取消交易
    void cancel(Order order);

    // 申诉
    void appeal(Order order);

    // 放行数字币
    void release(Order order);
}
