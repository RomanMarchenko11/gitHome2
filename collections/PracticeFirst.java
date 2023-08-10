package collections;

import java.util.ArrayList;
import java.util.Scanner;

/* 1 ArrayList
Напишіть програму - яка зчитує слово з консолі, працює до тих пір поки користувач не введе слово No, якщо
користувач вводить слово Yes - програма питає у нього слово - яке б додавало до арай лісту, коли користувач -
вводить слово No - програма виводить ліст на екран і завершує роботу

додатково - через те що це ліст, додати перевірку перед додаванням чи додається таке саме слово - якщо так
то вивести на екран наступне - ви ввели слово яке вже додано, введіть будь-ласка інше
 */
public class PracticeFirst implements PracticeTask {
    private final ArrayList<String> listWords = new ArrayList<>();
    public void task(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишіть будь-яке слово, якого ще не було. \nЩоб закінчити - набери - \"No\"");
        while (true) {
            String word = scanner.nextLine().toLowerCase();
            if (word.equals("no")){
                break;
            }
            if (listWords.contains(word)) {
                System.out.println("Ви ввели слово яке вже додано, введіть будь-ласка іншe");
            } else {
                listWords.add(word);
                System.out.println("Продовжуйте");
            }
        }
        System.out.println(listWords);
        scanner.close();
    }
}
