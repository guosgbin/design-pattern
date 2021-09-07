package cn.guosgbin.container.utils;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 22:06
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class StringUtils {
    private StringUtils() {
    }

    public static String getSetterMethodNameByField(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
