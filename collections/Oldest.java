package collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Oldest {
    private final static int MAX_SIZE = 5;
    private final LinkedHashMap<Integer,String> map = new LinkedHashMap<>(MAX_SIZE) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {

            return size() > MAX_SIZE;
        }
    };

    public void put (int key, String value) {
        map.put(key, value);
    }

    public String get(int key) {
        return map.get(key);
    }

    public void print(){
        System.out.println(map);
    }
}
