package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
Задача "Унікальні числа" (TreeSet)

    Напишіть програму, яка отримує від користувача числа і додає їх до TreeSet.
    Програма повинна продовжувати отримувати числа від користувача, поки він не введе "stop".
    Після того, як користувач введе "stop", програма повинна вивести всі унікальні числа, які були введені,
    у відсортованому порядку.
 */
public class PracticeFourth implements PracticeTask {
    Set<Integer> uniqueNumbers = new TreeSet<>();

    public void task() {
        addNumbers();
        print();
    }

    private void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Назбираємо трохи унікальних чисел, поки не введете команду \"Stop\"");
        System.out.println("Ваше перше число:");
        while (true) {
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                uniqueNumbers.add(a);
                System.out.print("Наступне число: ");
            } else {
                if (scanner.nextLine().equalsIgnoreCase("stop")) {
                    break;
                }
                else {
                    String string = scanner.nextLine();
                    System.out.println(string + "?! - введіть число або \"Stop\"");
                }
            }
        }
        scanner.close();
    }

    private void print() {
        System.out.println("Всі унікальні числа введені тобою: ");
        System.out.println(uniqueNumbers);
    }
}
