package cn.guosgbin.pattern.singleton;

import cn.guosgbin.pattern.singleton.eager.Singleton01;
import cn.guosgbin.pattern.singleton.solve.CloneSingleton;
import cn.guosgbin.pattern.singleton.solve.ReflectSingleton;
import cn.guosgbin.pattern.singleton.solve.SerializedSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/7/26 23:27
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {

    /**
     * 测试反射破坏单例
     */
    private static void RelectionTest() throws Exception {
        ReflectSingleton s1 = ReflectSingleton.getInstance();

        Constructor<ReflectSingleton> constructor =
                ReflectSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ReflectSingleton s2 = constructor.newInstance();

        System.out.println("s1 == s2 ? " + (s1 == s2)); // false
        System.out.println("s1哈希值:" + s1.hashCode()); // 1163157884
        System.out.println("s2哈希值:" + s2.hashCode()); // 1956725890
    }

    /**
     * 测试序列化破坏单例
     */
    private static void SerializedTest() throws Exception {
        SerializedSingleton s1 = SerializedSingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/single"));
        oos.writeObject(s1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/single"));
        SerializedSingleton s2 = (SerializedSingleton) ois.readObject();
        ois.close();

        System.out.println("s1 == s2 ? " + (s1 == s2)); // false
        System.out.println("s1哈希值:" + s1.hashCode()); // 2133927002
        System.out.println("s2哈希值:" + s2.hashCode()); // 1452126962
    }

    /**
     * 测试clone破坏单例
     */


    public static void main(String[] args) throws Exception{
        SerializedTest();
//        RelectionTest();
    }
}
