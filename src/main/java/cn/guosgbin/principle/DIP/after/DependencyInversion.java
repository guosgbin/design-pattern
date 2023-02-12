package cn.guosgbin.principle.DIP.after;

/**
 * @author: Dylan Kwok
 * @date: 2020/3/23 22:08
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

interface IReceiver{
    String getInfo();
}

class Email implements IReceiver{
    @Override
    public String getInfo() {
        return "电子邮件信息：hello email";
    }
}

class WeChat implements IReceiver{
    @Override
    public String getInfo() {
        return "微信消息：hello wechat";
    }
}

class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}