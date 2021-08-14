package cn.guosgbin.pattern.bridge.after;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/12 8:28
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Color {
    // 上色
    String applyColor();
}

class Black implements Color {
    @Override
    public String applyColor() {
        return "黑色";
    }
}

class Red implements Color {
    @Override
    public String applyColor() {
        return "红色";
    }
}