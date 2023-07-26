package Generics;
    // Генеричні класи

public class Box <T,K> {
    private T item;
    private K key;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
