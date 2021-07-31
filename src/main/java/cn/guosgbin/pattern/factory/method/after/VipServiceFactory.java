package cn.guosgbin.pattern.factory.method.after;

import cn.guosgbin.pattern.factory.method.common.PrizeTypeEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/7/31 8:57
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Slf4j
public class VipServiceFactory {

    private static final ConcurrentHashMap<Integer, VipService> vipServiceMap = new ConcurrentHashMap<>();

    static {
        vipServiceMap.put(PrizeTypeEnum.TENCENT_VIDEO_VIP.getType(), new TecentVedioVipService());
        vipServiceMap.put(PrizeTypeEnum.QQ_MUSIC_VIP.getType(), new QqMusicVipService());
        vipServiceMap.put(PrizeTypeEnum.QQ_SVIP.getType(), new QqSvipService());
        vipServiceMap.put(PrizeTypeEnum.HIMALAYA_VIP.getType(), new HimalayaVipService());
    }

    public VipService getVipService(Integer type) {
        VipService vipService = vipServiceMap.get(type);
        if (vipService == null) {
            throw new RuntimeException("奖品类型不存在");
        }
        log.debug("vipservice : {}", vipService.getClass());
        return vipService;
    }
}
