package collections;

import java.util.*;

public class LessonTwenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть завдання: \n1 - додавання до ArrayList" +
                "\n2 - Журнал останніх дій\" (LinkedList)" +
                "\n3 - LinkedHashMap (removeEldestEntry)" +
                "\n4 - \"Унікальні числа\" (TreeSet)" +
                "\n5 - Домашнє завдання - переклад слів на англійську та німецьку");
        String task = scanner.nextLine();
        switch (task) {
            case "1" -> {
                PracticeFirst task1 = new PracticeFirst();
                task1.task();
            }
            case "2" -> {
                PracticeSecond actionsFive = new PracticeSecond();
                actionsFive.task();
            }
            case "3" -> {
                PracticeThird oldestTen = new PracticeThird();
                oldestTen.task();
            }
            case "4" -> {
                PracticeFourth unique = new PracticeFourth();
                unique.task();
            }
            case "5" -> {
                HomeTask home = new HomeTask();
                home.task();
            }
            default -> System.out.println("The end!");
        }
        scanner.close();
    }

}
