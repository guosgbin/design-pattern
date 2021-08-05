package cn.guosgbin.pattern.prototype.type;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.var;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/4 8:59
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Getter
@Setter
@ToString
public class Company implements Cloneable, Serializable{
    private static final long serialVersionUID = -1070210034260878511L;
    private String name;
    private ArrayList<String> employees = new ArrayList<>();

    public Company() {
        System.out.println("调用了构造方法");
    }

    public void load4Database() {
        employees.add("小米");
        employees.add("小明");
        employees.add("老瓦");
    }

    /**
     * 浅拷贝
     */
//    @Override
//    protected Company clone() throws CloneNotSupportedException {
//        return (Company) super.clone();
//    }


    /**
     * 重写clone的深拷贝
     */
    @Override
    protected Company clone() throws CloneNotSupportedException {
        Company clone = (Company) super.clone();
        clone.setEmployees((ArrayList) employees.clone());
        return clone;
    }

    /**
     * 序列化实现的深拷贝
     */
    public Company deepClone() {
        Company clone = null;
        try (
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
        ) {
            oos.writeObject(this);
            try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()))) {
                clone = (Company) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
