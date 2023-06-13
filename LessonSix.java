import java.util.Scanner;
public class LessonSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chuslo;
        int potencia;

//        Формуємо меню:
        System.out.println("1. Виводимо тільки парні числа від 0 до заданого числа.");
        System.out.println("2. Виводимо числа Фібоначчі від 0 до заданого числа.");
        System.out.println("3. Виводимо таблицю множення для цілого числа від 0 до 9.");
        System.out.println("4. Виводимо потенцію числа (число в степені).");
        System.out.println("5. Виводимо факторіал цілого числа.");
        System.out.print("Ваш вибір: ");
        chuslo = sc.nextInt();

//        Формуємо залежність від вибору:
        switch (chuslo) {
            case 1 -> {
                System.out.print("Введіть ціле число: ");
                chuslo = sc.nextInt();
                parni(chuslo);
            }
            case 2 -> {
                System.out.print("Введіть ціле число: ");
                chuslo = sc.nextInt();
                fibonachchi(chuslo);
            }
            case 3 -> {
                System.out.print("Таблиця множення для числа: ");
                tablMultiplication(sc.nextInt());
            }
            case 4 -> {
                System.out.print("Введіть ціле число: ");
                chuslo = sc.nextInt();
                System.out.print(" та його потенцію: ");
                potencia = sc.nextInt();
                potenciaNumber(chuslo, potencia);
            }
            case 5 -> {
                System.out.print("Введіть ціле число: ");
                chuslo = sc.nextInt();
                factorial(chuslo);
            }
            default -> System.out.println("Завершено. Наступного разу виберіть від 1 до 5!");
        }
    }
    public static void parni (int number) {
        System.out.print("Парні числа від 0 до " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void fibonachchi (int number) {
        int number1;
        int number2 = 1;
        int number3 = 0;
        System.out.println("Числа Фібоначчі до значення " + number + ": ");
        while (number3 < number) {
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
            number3 = number2 + number1;
        }
    }

    public static void tablMultiplication (int y) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(y + " * " + i + " = " + (i * y));
        }
    }

    public static void potenciaNumber(int number, int potencia) {
        int x = 1;
        System.out.print(number + " в степені " + potencia + " = ");
        for (int i = 1; i <= potencia; i++) {
            x *= number;
            if (i == potencia ) {
                System.out.print(number);
            } else {
                System.out.print(number + " * " );
            }
        }
        System.out.print("= " + x);
    }

    public static void factorial (int number){
        int factor = 1;
        System.out.print("Факторіал числа: " + number +"! = ");
        do {
            factor *= number;
            if (number == 1) {
                System.out.print(number);
            } else {
                System.out.print(number + " * ");
            }
            number --;
        } while(number > 0);
        System.out.print(" = " + factor);
    }
}