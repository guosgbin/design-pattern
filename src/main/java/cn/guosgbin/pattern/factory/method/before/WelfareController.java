package cn.guosgbin.pattern.factory.method.before;

import cn.guosgbin.pattern.factory.method.common.*;

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
    private TecentVedioVipService tecentVedioVipService = new TecentVedioVipService();
    // 假装注入
    private QqMusicVipService qqMusicVipService = new QqMusicVipService();
    // 假装注入
    private QqSvipService qqSvipService = new QqSvipService();
    // 假装注入
    private HimalayaVipService himalayaVipService = new HimalayaVipService();

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
        if (Objects.equals(type, PrizeTypeEnum.TENCENT_VIDEO_VIP.getType())) {
            msg = tecentVedioVipService.sendVip(uid);
        } else if (Objects.equals(type, PrizeTypeEnum.QQ_MUSIC_VIP.getType())) {
            msg = qqMusicVipService.sendVip(uid);
        } else if (Objects.equals(type, PrizeTypeEnum.QQ_SVIP.getType())) {
            msg = qqSvipService.sendVip(uid);
        } else if (Objects.equals(type, PrizeTypeEnum.HIMALAYA_VIP.getType())) {
            msg = himalayaVipService.sendVip(uid);
        }
        return msg;
    }
}
