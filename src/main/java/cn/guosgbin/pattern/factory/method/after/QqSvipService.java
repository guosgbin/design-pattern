package cn.guosgbin.pattern.factory.method.after;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/7/31 8:44
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class QqSvipService implements VipService{
    public String sendVip(Long uid) {
        return "QQ号" + uid + "发送QQ绿钻成功";
    }
}
