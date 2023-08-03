package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
        Home task: Мапа потрібна містити інформацію про 10 будь-яких слів українською мовою і її переклад на:
        англійську, японську, німецьку. Коли користувач дає мапі слово українською - то потрібен отримати у
        результаті переклад на ці 3 мови.
 */
public class HomeTask implements PracticeTask {
    private ArrayList[] pereklad = new ArrayList[10];
    private final Map<String, ArrayList> tenWords = new HashMap<>(10);

    public void task() {
        translate();
        print();
    }

    private void translate() {
        for (int i = 0; i < pereklad.length; i++) {
            pereklad[i] = new ArrayList();
        }

        pereklad[0].add("англ.: Bird; " + "нім.: Vogel");
        pereklad[1].add("англ.: Animal; " + "нім.: Tier");
        pereklad[2].add("англ.: Building; " + "нім.: Gebaude");
        pereklad[3].add("англ.: Barn; " + "нім.: Scheune");
        pereklad[4].add("англ.: City; " + "нім.: Stadt");
        pereklad[5].add("англ.: Village; " + "нім.: Dorf");
        pereklad[6].add("англ.: Car; " + "нім.: Auto");
        pereklad[7].add("англ.: Motorcycle; " + "нім.:Motorrad");
        pereklad[8].add("англ.: Table; " + "нім.:Tisch");
        pereklad[9].add("англ.: Chair; " + "нім.: Stuhl");

        tenWords.put("Птах", pereklad[0]);
        tenWords.put("Тварина", pereklad[1]);
        tenWords.put("Будівля", pereklad[2]);
        tenWords.put("Сарай", pereklad[3]);
        tenWords.put("Місто", pereklad[4]);
        tenWords.put("Село", pereklad[5]);
        tenWords.put("Машина", pereklad[6]);
        tenWords.put("Мотоцикл", pereklad[7]);
        tenWords.put("Стіл", pereklad[8]);
        tenWords.put("Стілець", pereklad[9]);

        System.out.println("Яке з слів Ви хочете перекласти?");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        switch (word.toLowerCase()) {
            case "птах" -> System.out.println(tenWords.get("Птах"));
            case "тварина" -> System.out.println(tenWords.get("Тварина"));
            case "будівля" -> System.out.println(tenWords.get("Будівля"));
            case "сарай" -> System.out.println(tenWords.get("Сарай"));
            case "місто" -> System.out.println(tenWords.get("Місто"));
            case "село" -> System.out.println(tenWords.get("Село"));
            case "машина" -> System.out.println(tenWords.get("Машина"));
            case "мотоцикл" -> System.out.println(tenWords.get("Мотоцикл"));
            case "стіл" -> System.out.println(tenWords.get("Стіл"));
            case "стілець" -> System.out.println(tenWords.get("Стілець"));
            default -> System.out.println("Для цього слова переклад з'явиться згодом.");
        }
        scanner.close();
    }

    public void print() {
        System.out.println("\nВесь наявний словник:");
        for (Map.Entry<String, ArrayList> entry : tenWords.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " // Переклад: " + entry.getValue());
        }


//        System.out.println(tenWords);
    }
}
