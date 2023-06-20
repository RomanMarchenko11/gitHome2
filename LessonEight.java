import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonEight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Завдання: \n 1-практичні (на уроці) \n 2-домашні \nВаш вибір: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> lessonTask(random, scanner);
            case 2 -> homeTask(random);
            default -> System.out.println("Невірне значення!");
        }
    }
    public static void lessonTask (Random random, Scanner scanner) {

        int [] intArray = new int[5]; //5 елементів одномірного масиву
        int [] intArray2 = {1,3,5}; //3 елементу одномірного масиву

        String [] [] firstSecond = new String[3][3];

        for (int i=0; i < 5; i++){
            intArray[i] = random.nextInt(100);
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n-------------------------------");

        for (int i=0; i<firstSecond.length; i++) {
            for (int j=0; j<firstSecond[i].length; j++) {
                firstSecond[i][j] = String.valueOf(random.nextInt(100));
                System.out.print(firstSecond[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------");
        System.out.println("\n\n\nПрактика - виконуємо та розбираємо!");
//        1) Створіть масив цілих чисел та обчисліть суму всіх чисел в масиві.
//        2) Завдання: Знайдіть мінімальне та максимальне число в масиві.
        int [] numbers = new int[5];
        int sum = 0;
        int min = 10;
        int max = 0;
        System.out.println("Створюємо масив: ");
        for (int i=0; i<numbers.length; i++) {
            numbers [i] = random.nextInt(10);
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("\nCума чисел в масиві: " + sum);
        System.out.println("Максимальне: " + max + " \nМінімальне: " + min);
//            3) Зреверсуйте масив без використання додаткового масиву.
        int x = 0;
        for (int i = 0; i < numbers.length/2; i++) {
                x = numbers[i];
                numbers[i] = numbers[numbers.length - 1 - i] ;
                numbers[numbers.length - 1 - i] = x;
        }
        System.out.println("-------------------------------");
        System.out.println("Реверсивний масив виглядає так:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n-------------------------------");
//            4) Завдання: Перевірте, чи містить масив певне число
        System.out.print("Чи містить масив число? Загадайте число від 0 до 10: ");
        int numberFind = scanner.nextInt();
        int count = 0;
        for (int k = 0; k < numbers.length; k++) {
            if (numberFind == numbers[k]) {
                count++;
            }
        }
        System.out.println("\nМасив містить число " + numberFind + ": " + count +" шт.");
        System.out.println("-------------------------------");
//            5) Завдання: Знайдіть середнє значення елементів масиву.
        System.out.println("Cереднє значення елементів: " + sum/numbers.length);
        System.out.println("-------------------------------");
    }

    public static void homeTask (Random random) {
/*
Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами
 Вивести його на консоль
Знайти мінімальне значення
Знайти максимальне значення
Знайти середнє значення
Знайти суму всіх елементів
 */
//        створюємо масив та необхідні змінні
        int [] tenArray = new int[10];
        int sum = 0;
        int minValue = 10;
        int maxValue = 0;
        System.out.print("Елементи масиву: ");
//        Заповнюємо масив та визначаємо суму значень його елементів
        for (int i=0; i < tenArray.length; i++) {
            tenArray[i] = random.nextInt(10);
            System.out.print(tenArray[i] + " ");
            sum += tenArray[i];
//            Визначаємо мінімальне значення
            if (minValue > tenArray[i]) {
                minValue = tenArray[i];
            }
//            Визначаємо максимальне значення
            if (maxValue < tenArray[i]) {
                maxValue = tenArray[i];
            }
        }
//        Виводимо в консоль результати
        System.out.println("\n---------------------------------------");
        System.out.println("Максимальне значення: " + maxValue + "\nМінімальне значення: " + minValue );
        System.out.println("Cума всіх елементів масиву: " + sum);
        System.out.println("Cереднє значення всіх елементів масиву: " + sum / tenArray.length);
        System.out.println("---------------------------------------");
    }
}
