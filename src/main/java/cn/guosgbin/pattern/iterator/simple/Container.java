package cn.guosgbin.pattern.iterator.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/24 8:14
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface Container<E> {

    void add(E e);

    void remove(E e);

    // 获取迭代器
    Iterator<E> iterator();
}
