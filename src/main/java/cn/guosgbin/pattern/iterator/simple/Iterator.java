package cn.guosgbin.pattern.iterator.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/24 8:10
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Iterator<E> {
    // 是否有下一个元素
    boolean hasNext();

    // 获取下一个元素
    E next();
}
