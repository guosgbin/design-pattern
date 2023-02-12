package cn.guosgbin.principle.DIP.before;

/**
 * @author: Dylan Kwok
 * @date: 2020/3/23 22:08
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息: hello email";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}