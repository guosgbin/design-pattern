package cn.guosgbin.pattern.factory.method.after;

import cn.guosgbin.pattern.factory.method.common.PrizeTypeEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * 大王卡的福利特权
 * 每个月能个领取一款互联网的会员
 * 1.腾讯视频VIP
 * 2.QQ音乐绿钻
 * 3.QQ超级会员
 * 4.喜马拉雅会员
 */
public class WelfareController {

    // 假装注入
    private VipServiceFactory vipServiceFactory = new VipServiceFactory();

    /**
     * 发送礼物
     *
     * @param uid qq号
     * @param type 互联网权益类型 {@link PrizeTypeEnum}
     */
    public String sendWelfare(Long uid, Integer type) {
        if (uid == null) {
            return "QQ号不能为空";
        }
        String msg = "发放失败";
        VipService vipService = vipServiceFactory.getVipService(type);
        msg = vipService.sendVip(uid);
        return msg;
    }
}
