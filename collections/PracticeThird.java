package collections;

import java.util.LinkedHashMap;
import java.util.Map;

/*
        3 LinkedHashMap (removeEldestEntry)
        Створіть простий кеш для зберігання String значень з ключами типу Integer.
         Кеш повинен містити не більше 10 елементів. Якщо кількість елементів в кеші перевищує 10,
         програма повинна автоматично видаляти найстаріший елемент.
 */
public class PracticeThird implements PracticeTask {
    private final static int MAX_SIZE = 10;
    private final LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(MAX_SIZE) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
            return size() > MAX_SIZE;
        }
    };

    public void task() {
        put(1, "1");
        put(2, "2");
        put(3, "3");
        put(4, "4");
        put(5, "5");
        put(6, "6");
        put(7, "7");
        put(8, "8");
        put(9, "9");
        put(10, "a");
        System.out.println(linkedHashMap);
        put(11, "b");
        print();
    }
    private void put (int key, String value) {
        linkedHashMap.put(key, value);
    }

    private String get (int key) {
        return linkedHashMap.get(key);
    }

    private void print() {
        System.out.println(linkedHashMap);
    }
}
