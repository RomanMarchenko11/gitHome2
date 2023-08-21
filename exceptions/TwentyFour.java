package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        System.out.println("------------------Home Task First ------------------");
        homeTaskFirst();
        System.out.println("------------------Home Task Second------------------");
        System.out.println(homeTaskSecond(7));
        System.out.println(homeTaskSecond(-7));

        System.out.println("\n------------------Lesson Task First------------------");
        //Обробка NullPointerException та ArithmeticException
        System.out.println("Результат ділення : " + lessonTaskFirst(5, 0));
        System.out.println("\n------------------Lesson Task Second------------------");
//        lessonTaskSecond();
    }

    public static void homeTaskFirst() {
/*  1.
- Запросити з консолі число та огорнути цей функціонал у блоки обробки винятків.
- При вводі замість числа букв - показувати повідомлення про помилку на консоль.
- За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок
 */
        int numberOfScanner;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введіть число: ");
                numberOfScanner = scanner.nextInt();
                System.out.println("Введено таке число: " + numberOfScanner);
                scanner.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введено НЕ число! ");
            }
        }
    }

    public static int homeTaskSecond(int number) throws MyException {
    /*  2.
Створити виняток, який викидається коли число менше нуля.
Створити функцію, яка приймає число і повертає його квадрат.
Якщо число буде менше нуля - то викинути створений виняток
     */
        try {
            if (number <= 0) {
                throw new MyException("Помилка: Ви надали від'ємне число:");
            } else {
                return number * number;
            }
        } catch (MyException myException) {
            System.out.print(myException.getMessage());
            return number;
        }
    }

    public static int lessonTaskFirst(Integer a, int b) {
/*
     Напишіть функцію, яка ділить два числа. Якщо чисельник або знаменник дорівнює null,
     виведіть "Помилка: null значення". Якщо знаменник дорівнює 0, виведіть "Помилка: ділення на нуль".
 */
        try {
            return a / b;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Помилка: ділення на нуль");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Введено символ або не ціле число ");
        }
        return 0;
    }

    public static void lessonTaskSecond() {
        /*
Напишіть програму, що запитує у користувача два числа з консолі та ділить їх.
Використайте блок finally, щоб закрити об'єкт Scanner незалежно від виникнення винятків.
         */
        Scanner reader = null;
//        try (Scanner reader = new Scanner(System.in)) {
        try {
            reader = new Scanner(System.in);
            System.out.println("Введіть перше число: ");
            int a = reader.nextInt();
            System.out.println("Введіть друге число: ");
            int b = reader.nextInt();
            System.out.println("Результат ділення першого числа на друге: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: ділення на нуль");
        } catch (InputMismatchException e) {
            System.out.println("Введено символ або не ціле число ");
        }
        finally {
            if (reader != null) {
                reader.close();
                System.out.println("Reader closed");
            }
        }
    }
}
