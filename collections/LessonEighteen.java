package collections;

import java.util.*;

public class LessonEighteen {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("First");
        treeSet.add("Second");
        treeSet.add("Third");
        System.out.println(treeSet);

//        Home Work
//        1. У циклі на 1000 повтореннь сгенерувати випадкові числі діапазоном
//              від 1 до 50 за зберегти їх у різні типи колекцій сет
//        2. Вивести всі 3 варіанти на консоль
        System.out.println("Home Work - Loops and Sets");
        System.out.println("-----------------------------------");
        Random random = new Random();
        HashSet<Integer> evenNumbers = new HashSet<>();
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
        TreeSet<Integer> treeNumbers = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {
            int number = random.nextInt(1, 50);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                treeNumbers.add(number);
            }
            uniqueNumbers.add(number);
        }
        System.out.println("HashSet парних чисел:\n" + evenNumbers);
        System.out.println("TreeSet непарних чисел:\n" + treeNumbers);
        System.out.println("LinkedSet унікальних чисел:\n" + uniqueNumbers);
    }

}
