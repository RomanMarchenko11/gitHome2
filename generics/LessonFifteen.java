package generics;

import java.util.Arrays;

public class LessonFifteen<EA> {

    public static void main(String[] args) {
        System.out.println("Home Task");
        Animal[] animals = {new Dog(10305, 5),new Cat("Vaska", 3.5), new Parrot("Kesha", 3)};
        animals[0].Voice();
        animals[1].Voice();
        animals[2].Voice();

        Animals animal = new Animals();
        animal.setAnimal(animals[1]);
        System.out.println("--------------------");
        animal.voiceAnimal();
        System.out.println("--------------------");

//                Lesson Work
        System.out.println("Practice");
        Box box = new Box();
        box.setItem("12345");
        box.setKey(54321);
        System.out.println(box.getItem() + " " + box.getKey());

        System.out.println(box.getItem());
        box.setItem(12345);
        System.out.println(box.getItem());
        int[] array = {1, 2, 3, 4, 5};
        box.setItem(array);
        System.out.println(box.getItem());
        Person person = new Person("Argon", 25);
        box.setItem(person);
        System.out.println(box.getItem());

        System.out.println("\nGenerics Methods: ");
        Integer[] intArray = {1, 3, 7};
        String[] stringArray = {"a", "b", "c"};
        Person[] personArray = {new Person("Andriy", 25), new Person("Bogdan", 35), new Person("Vlad", 45)};
        printArray(intArray);
        printArray(stringArray);
        printArray(personArray);

        System.out.println("\nNumeric Box - тільки будь-які числа");
        NumericBox<Integer> integerBox = new NumericBox<>(25);
        NumericBox<Double> doubleBox = new NumericBox<>(25.5);

        System.out.println("\nТільки будь-які Hobby");
        Hobby basketball = new Basketball();
        Hobby football = new Football();
        Human human = new Human();
        human.setHobby(basketball);
        human.runHobby();
        human.setHobby(football);
        human.runHobby();

        System.out.println("\nGenerics and Interface");
        Comparable text = new Text("312");
        text.compareTo("212");
        Comparable number = new Numbers(412);
        number.compareTo(512);

//        task 1
        System.out.println("Викликаємо метод з завдання 1");
        System.out.println(Arrays.toString(intArray));
        GenericSwap.swap(intArray, 0, 2);
        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.toString(stringArray));
        GenericSwap.swap(stringArray, 0, 2);
        System.out.println(Arrays.toString(stringArray));

        System.out.println(Arrays.toString(personArray));
        GenericSwap.swap(personArray, 0, 2);
        System.out.println(Arrays.toString(personArray));
//        task 2
        System.out.println("Викликаємо метод з завдання 2");
//        GenericMax.max(intArray);

        System.out.println("Створюємо об'єкти Pair з завдання 3");
        Pair<Integer, String> pair = new Pair(25, "Second");
        Pair<String, Integer> pair2 = new Pair("First", 55);
        Pair<Integer, Integer> pair3 = new Pair<>(25, 55);
        System.out.println(pair);
        System.out.println(pair2);
        System.out.println(pair3);
    }

    private static <EA> void printArray(EA[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
