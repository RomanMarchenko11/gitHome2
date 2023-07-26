package collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LessonSeventeen {
    public static void main(String[] args) {
//        Home Work
        System.out.println("-------------------------------------------------");
        System.out.println("Home task");
        System.out.println("Введіть кількість зберігаємих елементів");
        Scanner scanner = new Scanner(System.in);
        NumbersList.StorageList(scanner.nextInt());

        Student Petrov = new Student("Anton", "Petrov", 3);
        Student Ivanov = new Student("Ivan", "Zybkov",  3);
        Student Samoilov = new Student("Oleg", "Samoilov", 3);
        List<Student> groupOfStudent = new ArrayList<>();
        groupOfStudent.add(Petrov);
        groupOfStudent.add(Ivanov);
        groupOfStudent.add(Samoilov);
        System.out.println(groupOfStudent);

//        Lesson Practice
        System.out.println("-------------------------------------------------");
        Human andriy = new Human();
        andriy.setName("Andrey");
        andriy.setSurname("Belov");
        andriy.setAge(30);

        Human vasiliy = new Human();
        vasiliy.setName("Vasiliy");
        vasiliy.setSurname("Menshov");
        vasiliy.setAge(31);

        Human nestor = new Human();
        nestor.setName("Nestor");
        nestor.setSurname("Volkov");
        nestor.setAge(40);

        //        ArrayList
        List<Human> humanArrayList = new ArrayList<>();
        humanArrayList.add(andriy);
        humanArrayList.add(vasiliy);
        humanArrayList.add(nestor);


        List<Integer> variables = new ArrayList<>();
        variables.add(1);
//        LinkedList
        List<Human> humanLinkedList = new LinkedList<>();
        humanLinkedList.add(andriy);
        humanLinkedList.add(vasiliy);
        humanLinkedList.add(nestor);

//        Vector
        List<Human> humanVector = new Vector<>();
        humanVector.add(andriy);
        humanVector.add(vasiliy);
        humanVector.add(nestor);

//        CopyOnWriteArrayList
        List<Human> humanCopyOnWriteArrayList = new CopyOnWriteArrayList<>();
        humanCopyOnWriteArrayList.add(andriy);
        humanCopyOnWriteArrayList.add(vasiliy);
        humanCopyOnWriteArrayList.add(nestor);

        System.out.println("-------------------------------------------------");
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        String firstName = names.get(0);
        System.out.println("Перший елемент колекції Names: " + firstName);
        System.out.println("Кількість елементів в колекції Names: " + names.size());

        System.out.println("-------------------------------------------------");
        LinkedList<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Зміст колекції до видалення:" + queue);
        String firstElement = queue.removeFirst();
        System.out.println("Видалений елемент: " + firstElement);
        System.out.println("Зміст колекції після видалення:" + queue);

        System.out.println("-------------------------------------------------");
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Зміст колекції: " + numbers);
        numbers.add(2, 25);
        System.out.println("Оновлена колекція: " + numbers);

        System.out.println("-------------------------------------------------");
        System.out.println("Task 1");
//        numbersArray();
        System.out.println("-------------------------------------------------");
        System.out.println("Task 2");
        long start = System.currentTimeMillis();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list1.add(i);
        }
        for (int i = 0; i < list1.size(); i++) {
            list1.get(i);
        }
//        for (int i = 0; i <=list1.size(); i++) {
//            list1.remove(i);
//        }
        long end = System.currentTimeMillis();
        System.out.println("list1 - Array: " + (end - start));

        long start1 = System.currentTimeMillis();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            list2.get(i);
        }
//        for (int i = 100000; i > 0; i--) {
//            list2.remove(i);
//        }
        long end1 = System.currentTimeMillis();
        System.out.println("list2 - LinkedList: " + (end1 - start1));
    }

    private static void numbersArray() {
        List<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextInt());
        }

        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                System.out.print(arrayList.get(i) + " ");
            }
        }
    }
}
