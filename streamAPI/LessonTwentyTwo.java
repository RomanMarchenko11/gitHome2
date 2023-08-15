package streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LessonTwentyTwo {
    /* Home Task
    1. Створити лист з 20 прізвищами. Вони повинні повторюватися. За допомогою стрім апі перетворити цей лист на мапу.
    У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.
    2. Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API
     */

    public static void main(String[] args) {
        System.out.println("-----------------Home-Work------------------");
        System.out.println("----------------First-Task------------------");
        List<String> surNameList = Stream.of("Заховайло", "Забудько", "Півень", "Хруст", "Мавка", "Черепанов", "Буданов",
                "Баранець", "Хруст", "Михась", "Міняйло", "Хруст", "Буданов", "Черепко", "Хруст", "Півень", "Дерев'яний", "Плювайло",
                "Буданов", "Михась", "Бережнов", "Заховайло").toList();
        Map<String, Long> countOfSurname = surNameList.stream().collect(Collectors.groupingBy(surName -> surName, Collectors.counting()));

        System.out.println(countOfSurname.toString());
        System.out.println("---------------Second-Task------------------");
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 56, 8, 7, 8, 9, 87, 23, 67, 34, 78, 87, 42, 33, 22, 25);
        Optional<Integer> sumOfNumbers = listOfNumbers.stream().reduce((a, b) -> a + b);
        System.out.println("Сума всіх чисел в sumOfNumbers: " + sumOfNumbers.get());


        System.out.println("---------------Practice---------------------");
        List<String> listDisnctint = Arrays.asList("a1", "a2", "a1", "a2", "a1", "a2", "a1", "a3", "a1", "a3");
        System.out.print("Stream - method distinct(): " + listDisnctint + " - ");
        listDisnctint.stream().distinct().forEach(System.out::print);

        System.out.print("\nStream - method sorted(): " + listDisnctint + " - ");
        listDisnctint.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.print("\nStream - method sorted(): " + listDisnctint + " - ");
        listDisnctint.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);

        System.out.print("\nStream - method limit(): " + listDisnctint + " - ");
        listDisnctint.stream().limit(3).forEach(System.out::print);
        System.out.print("\nStream - method skip(): " + listDisnctint + " - ");
        listDisnctint.stream().skip(3).forEach(System.out::print);
        System.out.print("\nStream - method skip(): " + listDisnctint + " - ");
        listDisnctint.stream().forEach(
                string -> {
                    int i = 0;
                    if (string.equals("a2")) {
                        System.out.println(string);
                    }
                }
        );

        List<Integer> reduceNumbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.print("\nStream - method reduce(): " + reduceNumbers + " - ");
        Optional<Integer> sum = reduceNumbers.stream().reduce((a, b) -> a + b);
        Integer sum1 = reduceNumbers.stream().reduce(1, (a, b) -> a + b); //1 - початкове значення
        System.out.print("\nStream - method collect(): " + " - ");
        Stream.of("1", "2", "3", "4", "5").collect(Collectors.toList());
        Stream.of("1", "2", "3", "4", "5").anyMatch(string -> Objects.equals(string, "2"));
        listDisnctint.stream().filter(string -> Objects.equals(string, "a1")).distinct().sorted().map(Objects::toIdentityString).toList();

        System.out.print("\nStream - method max(): " + " - ");
        Optional<Integer> max = reduceNumbers.stream().max(Integer::compare);
        System.out.println(max.get());

        System.out.print("\nStream - method min(): " + " - ");
        Optional<Integer> min = reduceNumbers.stream().min(Integer::compare);
        System.out.println(min.get());

        System.out.println("\n-----------------List Human - ------------------");
        List<Human> listHumans = List.of(new Human("Serg", "Konovalov", "SergK@gmail.com", new Dog("Bobik")),
                new Human("Anry", "Konan", "AnryK@ukr.net", new Dog("Bul")),
                new Human("Bogdan", "Volya", "BogV@icloud.com", new Dog("Bogv")));
        List<Dog> dogList = listHumans.stream().filter(human -> Objects.equals(human.getName(), "Bogdan")).map(
                Human::getDog
        ).filter(dog -> Objects.equals(dog.getName(), "Bogv")).toList();
        System.out.println("Our list of Human: " + listHumans);
        System.out.println("Our list of dogs: " + dogList);

        System.out.println("-----------------Task 1------------------");
//        перетворити список чисел в квадрати за допомогою map, а потім знайти добуток за допомогою reduce
        List<Integer> numbers = Arrays.asList(2, 3, 4);
        int product = numbers.stream().map(x -> x * x).reduce(1, (a, b) -> a * b);
        //map - 2*2 = 4, 3*3 = 9, 4*4 = 16
        //reduce - (починається з 1 - вказано в виразі)1*4 - 4*9 - 36 * 16 = 576

        System.out.println("-----------------Task 2------------------");
//        сортування за довжиною рядка, пропуск перших 2-х елементів, вивести тільки перших 2 елементи
        List<String> result = surNameList.stream().sorted(Comparator.comparingInt(String::length)).skip(2).limit(2).toList();
        System.out.println("Виведення результату: " + result);
    }
}
