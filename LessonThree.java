import java.util.*;
/*
        Об’явити 2 змінні типу Integer та показати в консолі результати:
             Додавання
                Віднімання
             Ділення
                Множення
*/
public class LessonThree {
    public static void main(String[] args) {
// Оголошення 2-х змінніх типу Integer
        int a;
        int b;
// Надаємо значення для 2-х чисел
        System.out.println("Вкажіть значення першого числа");
        Scanner number = new Scanner(System.in);
        a = number.nextInt();
        System.out.println("Вкажіть значення другого числа");
        b = number.nextInt();
// Виводимо в консоль результати арифметичних операцій
        System.out.println("Результати додавання: " + (a + b));
        System.out.println("Результати віднімання: " + (a-b));
        System.out.println("Результати ділення: "+ (a/b));
        System.out.println("Результати множення: " + (a * b));
    }
}
