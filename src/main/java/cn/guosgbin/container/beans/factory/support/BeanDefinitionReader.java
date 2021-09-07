package cn.guosgbin.container.beans.factory.support;

/**
 * 用来解析配置文件
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 8:41
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface BeanDefinitionReader {
    // 获取注册表对象
    BeanDefinitionRegistry getRegistry();

    // 加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
