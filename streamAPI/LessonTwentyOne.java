package streamAPI;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Home Task: Створити клас студент з полями Прізвище та Середній бал.
Написати два компаратори для сортування по цим полям.
У головному класі наповнити лист даними про студентів та відсортувати за допомогою цих компараторів.
Показати на консоль 3 варіанти листа: оригінальний та 2 відсортованих.
 */
public class LessonTwentyOne {

    public static void main(String[] args) {
        System.out.println("------Home Work------");
        Student Viktor = new Student("Barko", 55);
        Student Oleg = new Student("Norman", 35);
        Student Stanislav = new Student("Mayorov", 40);
        List<Student> students = Arrays.asList(Viktor, Oleg, Stanislav);
        List<Student> gradeOfStudents = students.stream().filter(student -> student.getAverageGrade() > 30).toList();
        List<Integer> grade = students.stream().map(Student::getAverageGrade).toList();
        List<String> grade1 = students.stream().map(Student::getSurname).toList();

        System.out.println(students);
        System.out.println(gradeOfStudents);
        System.out.println(grade);
        System.out.println(grade1);

        System.out.println("------Lesson------");
        SimpleInterface simpleInterface = (a, b) -> a + b;
//        виклик інтерфейсу
        int result = simpleInterface.doSomething(5, 3);
        System.out.println(result);

        System.out.println("------java.util.function - functionalInterfaces------");
        Predicate<String> stringLengthIsGreaterThanFive = str -> str.length() > 5;
        System.out.println(stringLengthIsGreaterThanFive.test("Hello, World!"));
        System.out.println(stringLengthIsGreaterThanFive.test("Hello"));

        Function<String, Integer> stringLengthFunction = str -> str.length();
        System.out.println(stringLengthFunction.apply("Hello, World!"));
        System.out.println(stringLengthFunction.apply("Hello"));

        Consumer<String> printStringConsumer = str -> System.out.println(str);
        printStringConsumer.accept("Hello, World!");
        printStringConsumer.accept("Hello");

        Supplier<LocalDateTime> currentTimeSupplier = () -> LocalDateTime.now();
        System.out.println(currentTimeSupplier.get());

        System.out.println("---------streamAPI---------");
        List<String> names = Arrays.asList("Andriy", "Sergiy", "Vladislav", "Ivan");
        List<String> namesHowCanCreate = Stream.of("Valentina", "Olena", "Olga", "Kseniya").toList();
        List<String> namesOneMoreVariantHowToCreate = List.of("Joan", "Galina", "Anton", "Joana");
        System.out.println(names);
        System.out.println(namesHowCanCreate);
        System.out.println(namesOneMoreVariantHowToCreate);
        List<String> filteredNames = namesOneMoreVariantHowToCreate.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        int[] array = {1, 2, 3, 4, 5, 6};
        IntStream intStream = Arrays.stream(array);
        Stream<String> streamOfString = Stream.of("Java", "Python", "C++");

        System.out.println("---------streamOperations---------");
        names.stream().forEach(System.out::println);
        List<String> list = Arrays.asList("Java", "Python", "C++");
        list.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);
        List<Integer> vuvod = list.stream().map(
                language -> {
            if (language.equals("Java")) {
                return 1;
            } else {
                return 2;
            }
        }).toList();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce((a,b) -> a + b);
        System.out.println(sum.get());

        System.out.println("---------Practice---------");
        System.out.println("Task 1");
        Practice1("Hello, World");
        System.out.println("Task 2");
        Practice2(324);
        System.out.println("Task 3");
        List<Integer>  listNumbers = List.of(34, 579, 325, 549, 4343);
        Practice3(listNumbers);
        System.out.println("Task 4");
        Practice4(namesOneMoreVariantHowToCreate);
        System.out.println("Task 5");
        Practice5(listNumbers);
    }
    public static void Practice1 (String length) {
//        Задача 1: Написати лямбда-функцію, яка повертає довжину рядка.
        Function<String, Integer> lengthOfString = stringLength -> stringLength.length();

        System.out.println(length + " - symbols: "+ lengthOfString.apply(length));
    }
    public static void Practice2 (int ifOdd) {
//        Задача 2: Написати лямбда-функцію, яка перевіряє, чи є число парним.
        Predicate<Integer> ifNumberOdd = pair -> pair % 2 == 0;
        System.out.println("Наше число парне - " + ifNumberOdd.test(ifOdd));
    }
    public static void Practice3 (List<Integer> list) {
//        Задача 3: Використовуючи Stream API, знайти максимальне число в списку.
        Optional<Integer> result = list.stream().max(Integer::compareTo);
        System.out.println("Max number: " + result.get());
    }
    public static void Practice4 (List<String> list) {
//        Задача 4: Використовуючи Stream API, вибрати всі рядки в списку, що починаються з певної букви (скажімо, "a").
        List<String> result = list.stream().filter(member -> member.toLowerCase().startsWith("a")).toList();
        System.out.println(result);
    }
    public static void Practice5 (List<Integer> list) {
//        Задача 5: Використовуючи Stream API, обчислити суму всіх чисел в списку.
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сума чисел в списку " + list + ": " + sum);
    }


}
