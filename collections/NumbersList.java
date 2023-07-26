package collections;
/*
1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів.
    Для кожного підібрати свій тип
2. Зберегти у колекції список студентів (класс Студент теж створити)
3. Вивести цей список
4. Опціонально: написати реалізацію класу ArrayList або LinkedList
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumbersList {

    public static void StorageList(int x) {
        if (x > 0 && x < 100 ) {
            List<Integer> storageLinkedList = new LinkedList<>();
            addList(storageLinkedList, x);
        } else if (x > 100) {
            List<Integer> storageArrayList = new ArrayList<>();
            addList(storageArrayList, x);
        }
    }

    private static void addList(List<Integer> list, int x) {
        for (int i = 0; i < x; i++) {
            list.add(i);
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
