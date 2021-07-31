package cn.guosgbin.pattern.factory.method.before;

public enum PrizeTypeEnum {
    TENCENT_VIDEO_VIP(1, "腾讯视频会员"),
    QQ_MUSIC_VIP(2, "QQ音乐绿钻"),
    QQ_SVIP(3, "QQ超级会员"),
    HIMALAYA_VIP(4, "喜马拉雅FM会员");

    private Integer type;
    private String name;

    PrizeTypeEnum(Integer type, String name) {
        this.type = type;
        this.name = name;
    }
}
