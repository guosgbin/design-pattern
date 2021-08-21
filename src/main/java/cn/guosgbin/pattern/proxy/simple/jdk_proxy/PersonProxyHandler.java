package cn.guosgbin.pattern.proxy.simple.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/19 23:53
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class PersonProxyHandler implements InvocationHandler {
    // 要代理的对象
    private Object target;

    public PersonProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("吃饭前准备工作");
        Object value = method.invoke(target, args);
        System.out.println("吃饭后收拾工作");
        return value;
    }
}
