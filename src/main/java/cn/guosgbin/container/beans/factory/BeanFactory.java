package cn.guosgbin.container.beans.factory;

/**
 * IOC容器父接口
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 21:32
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface BeanFactory {
    // 根据bean的名称获得bean对象
    Object getBean(String name) throws Exception;

    // 根据bean的名称获得指定类型的bean对象
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
