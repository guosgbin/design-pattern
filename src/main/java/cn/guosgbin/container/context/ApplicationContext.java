package cn.guosgbin.container.context;

import cn.guosgbin.container.beans.factory.BeanFactory;

/**
 * 定义非延迟加载功能
 *
 * @author: Dylan kwok GSGB
 * @date: 2021/9/7 21:34
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public interface ApplicationContext extends BeanFactory {
    // 根据配置文件加载进行对象创建
    void refresh() throws IllegalStateException, Exception;

}
