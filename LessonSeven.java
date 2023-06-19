import java.util.Scanner;

public class LessonSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть одну з наступних задач:");
        System.out.println("1-класна робота: калькулятор 2-класна робота:");
        System.out.println("3-домашнє завдання: куб заданого числа; виведення зірочок, що дорівнює заданому числу");
        System.out.println("4-домашнє завдання: вивести заданий символ задану кількість разів");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1 -> task1();
            case 2 -> task2();
            case 3 -> task3();
            case 4 -> task4();
            default -> System.out.println("Неприйнятне значення!");
        }
    }

    public static void task1() {
        /* створення простого калькулятора: напишіть методи для кожної з основних арифметичних операцій
        (додавання, віднімання, множення, ділення). Методи повинні приймати два числа як параметри і повертати
        результат обчислення */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доброго дня! Зробимо арифметичну операцію над 2-а числами!");
        System.out.print("Введіть значення першого числа: ");
        int x = scanner.nextInt();
        System.out.print("Введіть значення другого числа: ");
        int y = scanner.nextInt();
        switchOperation(x,y);
    }

    private static void switchOperation(int x, int y) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Арифметична операція:");
        System.out.println("1-додавання 2-віднімання 3-множення 4-ділення (без залишку)");
        System.out.print("Ваш вибір: ");
        int operation = scanner.nextInt();
        int c;
        switch (operation) {
            case 1 -> c = plus(x, y);
            case 2 -> c = minus(x, y);
            case 3 -> c = multiplication(x, y);
            case 4 -> c = division(x, y);
            default -> c =0;
        }
        System.out.println("Відповідь: " + c);
        System.out.println("1-продовжити розрахунки 2-наступного разу");
        operation = scanner.nextInt();
        if (operation == 1) {
            x = c;
            if (x == 0) {
                System.out.println("Введіть перше число: ");
                x = scanner.nextInt();
                System.out.println("Введіть друге число: ");
                y = scanner.nextInt();
            } else {
                System.out.println("Перше число: " + c + " Введіть друге число: ");
                y = scanner.nextInt();
            }
            switchOperation(x, y);
        }
    }
    private static int plus(int a, int b) {
        return a + b;
    }
    private static int minus(int a, int b) {
        return a - b;
    }
    private static int multiplication(int a, int b) {
        return a * b;
    }
    private static int division(int a, int b) {
        return a / b;
    }

    private static void task2 () {

    }
    private static void task3 (){
//        Створити метод який повертає куб заданого числа
//        Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте ціле число: ");
        int a = scanner.nextInt();
        System.out.println("Куб числа " + a + " = " + vCube(a));
    }

    private static int vCube(int a) {
        for (int x = 0; x < a; x++) {
            System.out.print(" * ");
        }
        System.out.println();
        return a * a * a;
    }

    private static void task4 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Додайте символ/ фразу:");
        String symbol = scanner.next();
        System.out.println("Вкажіть кількість символів/ фраз: ");
        int x = scanner.nextInt();
        symbolCount(symbol, x);
    }
    private static void symbolCount (String symbol, int x) {
        if (x > 0) {
            for (int i = 1; i <= x; i++){
                if (i % 10 == 0) {
                    System.out.println(symbol + " ");
                } else {
                    System.out.print(symbol + " ");
                }
            }
        }
    }
}
