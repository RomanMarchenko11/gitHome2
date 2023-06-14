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
        System.out.println("6. Виводимо прямокутник з зірочок.");
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
            case 6 -> {
                System.out.println("Введіть ширину прямокутника (кількість зірочок): ");
                chuslo = sc.nextInt();
                System.out.println("Введіть висоту прямокутника (кількість зірочок): ");
                potencia = sc.nextInt();
                pryamokytnuk(chuslo, potencia);
            }
            default -> System.out.println("Завершено. Наступного разу виберіть від 1 до 6!");
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

    public static void pryamokytnuk (int i, int j) {
        if (i > 0 && j > 0) {
            for (int m = i + 2 ; m > 0; m--) {
                System.out.print(" - ");
            }
            System.out.println();
            for (int n = j; n > 0; n--) {
                System.out.print(" | ");
                for (int k=i ; k > 0; k--) {
                    System.out.print(" * ");
                }
                System.out.println(" | ");
                if ( n == (j + 2) / 2)   {
                    for (int m = i + 2 ; m > 0; m--) {
                        System.out.print(" + ");
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println("Значення ширини та висоти прямокутника мають бути більше нуля");
        }
        for (int m = i + 2; m > 0; m--){
            System.out.print(" - ");
        }
    }
}