package cn.guosgbin.pattern.proxy.simple.cglib_Proxy;

import cn.guosgbin.pattern.proxy.simple.common.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/21 17:26
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class PersonProxyFactory implements MethodInterceptor {

    private Object target;

    public PersonProxyFactory(Object target) {
        this.target = target;
    }

    public Person getProxyObject() {
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(Person.class);
        // 设置回调，当前类实现了
        enhancer.setCallback(this);
        return (Person) enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("吃饭前准备工作");
        Object value = method.invoke(target, objects);
        System.out.println("吃饭后收拾工作");
        return value;
    }
}
