package cn.guosgbin.pattern.iterator.simple;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/24 8:28
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Client {
    public static void main(String[] args) {
        PersonContainer container = new PersonContainer();
        container.add(new Person("小明", 10));
        container.add(new Person("小胡", 13));
        container.add(new Person("小周", 6));

        Iterator<Person> iterator = container.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
