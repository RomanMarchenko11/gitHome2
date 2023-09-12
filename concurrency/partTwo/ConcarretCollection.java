package concurrency.partTwo;

import java.util.concurrent.ConcurrentHashMap;

public class ConcarretCollection {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
//        adding elements
        map.put("one",1);
        map.put("two",2);
//        retrieving elements
        int value = map.get("one");
        System.out.println("Value for \"one\": " + value);
    }
}
