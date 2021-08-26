package cn.guosgbin.pattern.iterator.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/24 8:16
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class PersonContainer implements Container<Person> {
    private List<Person> personList = new ArrayList<>();
    @Override
    public void add(Person e) {
        personList.add(e);
    }

    @Override
    public void remove(Person e) {
        personList.remove(e);
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator<Person> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
           return cursor != personList.size();
        }

        @Override
        public Person next() {
            return personList.get(cursor++);
        }
    }
}
