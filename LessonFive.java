/*
Створити 3 програми:
    - програму для знаходження більшого з двох чисел
    - програму для знаходження меншого з двох чисел
    - програму для перевірки заданого числа на парність
 */
public class LessonFive {
    public static void main(String[] args) {
        int x = 15;
        int y = 28;

        // Check: Which of the two numbers is bigger or smaller?
        System.out.println("--------------------------------------------------------------");
        System.out.println("З двох чисел (" + x + ", " + y + ") найбільше: " + bigger(x, y));
        System.out.println("З двох чисел (" + x + ", " + y + ") найменше: " + smaller(x, y));
        System.out.println("--------------------------------------------------------------");
        // Check: are our numbers pairs?
        System.out.println("Чи парне наше число Х = " + x + " - " + pair(x));
        System.out.println("Чи парне наше число Y = " + y + " - " + pair(y));
        System.out.println("--------------------------------------------------------------");
        //Який день тижня сьогодні?
        dayWeek(8);
        System.out.println("--------------------------------------------------------------");
        //Яку оцінка отримав
        mark("R");
        System.out.println("--------------------------------------------------------------");
        // Належність до категорія населення
        category(17);
        System.out.println("--------------------------------------------------------------");
    }
    private static int bigger(int a, int b) {
        // find the bigger number between two
        if (a > b) {
            return a;
        } else if ( a == b) {
            return (0);
        } else {
            return b;
        }
    }

    private static String smaller(int a, int b) {
        // find the smaller number between two
        if (a < b) {
            return ("" + a);
        } else if ( a == b) {
            return ("Error: порівнюються числа з однаковими значеннями.");
        } else {
            return ("" + b);
        }
    }

    private static String pair(int c) {
        if (c%2 == 0) {
            return "Парне.";
        }
        return "Непарне.";
    }
/*
завдання з зірочкою для світч :  (це мало б бути без додаткових моментів)
Написати програму, що конвертує числа від 1 до 7 в дні тижня.
Написати програму, що приймає оцінку (від A до F) та виводить повне значення оцінки ("Excellent", "Good", "Fair", "Poor").
і ще одне :
Написати програму, яка приймає вік користувача та виводить категорію віку (наприклад, дитина, підліток, дорослий, літній чоловік).
Діапазон нехай буде такий :
Дитина 0-12, підліток 13-17, дорослий 18-50, літній 51-100)

не забувайте ще додавати перевірки (наприклад) - якщо в ваш метод як інпут закинуть -3
 */
    private static void dayWeek(int d) {
//      Визначаємо який день тижня за цифрою від 1 до 5
        switch (d) {
            case 1 -> System.out.println("Today day of week is Monday.");
            case 2 -> System.out.println("Today day of week is Thuesday.");
            case 3 -> System.out.println("Today day of week is Wednesday.");
            case 4 -> System.out.println("Today day of week is Thursday.");
            case 5 -> System.out.println("Today day of week is Friday.");
            case 6 -> System.out.println("Today day of week is Saturday.");
            case 7 -> System.out.println("Today day of week is Sunday.");
            default -> System.out.println("Error: Введено некоректне числове значення тижня.");
        }
    } // end method dayWeek

    private static void mark (String bal) {
//        Визначення повної оцінки за буквою від A до F
        switch (bal) {
            case "a","A":
                System.out.println("Отримана оцінка: " + bal + " (Excellent).");
                break;
            case "b", "B", "c", "C":
                System.out.println("Отримана оцінка: " + bal + " (Good).");
                break;
            case "d", "D", "e", "E":
                System.out.println("Отримана оцінка: " + bal + " (Fair).");
                break;
            case "f", "F":
                System.out.println("Отримана оцінка: " + bal + " (Poor).");
                break;
            default: System.out.println("Оцінка " + bal + " некоректна - зкорегуйте оцінку від A од F.");
        }
    } // end method mark

    private static void category (int age) {
        // визначаємо в який діапазон попадає значення
        int caseAge = 0;
        if (age >= 0 && age < 13) {
            caseAge = 1;
        } else if (age >= 13 && age < 18) {
            caseAge = 2;
        } else if (age >= 18 && age < 51) {
            caseAge = 3;
        } else if (age >= 51 && age < 100){
            caseAge = 4;
        }
        // визначаємо категорію з отриманого діапазону
        switch (caseAge) {
            case 1 -> System.out.println("Ваш вік: " + age + " - Категорія: Діти.");
            case 2 -> System.out.println("Ваш вік: " + age + " - Категорія: Підлітки.");
            case 3 -> System.out.println("Ваш вік: " + age + " - Категорія: Дорослі.");
            case 4 -> System.out.println("Ваш вік: " + age + " - Категорія: Літні.");
            default -> System.out.println("Cтільки не живуть! ))");
        }
    } // end method category
}
