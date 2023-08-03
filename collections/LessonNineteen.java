package collections;

import java.util.*;

public class LessonNineteen {
    public static void main(String[] args) {
        Map<Integer, Human> humanHashMap = new HashMap<>();
        Map<Integer, Human> humanTreeMap = new TreeMap<>();
        Map<Integer, Human> humanLinkedMap = new LinkedHashMap<>();

        Human Lida = new Human();
        Lida.setName("Lida");
        Lida.setSurname("Myzuchenko");
        Lida.setAge(33);

        Human Denis = new Human();
        Denis.setName("Denis");
        Denis.setSurname("Drodov");
        Denis.setAge(35);

        Human Lora = new Human();
        Lora.setName("Lora");
        Lora.setSurname("Modrova");
        Lora.setAge(37);

        humanHashMap.put(1, Lida);
        humanHashMap.put(2, Denis);
        humanHashMap.put(3, Lora);

        humanTreeMap.put(1, Denis);
        humanTreeMap.put(2, Lida);
        humanTreeMap.put(3, Lora);

        humanLinkedMap.put(1, Lora);
        humanLinkedMap.put(2, Lida);
        humanLinkedMap.put(3, Denis);
// Цикл For
        for (Map.Entry<Integer, Human> entry : humanHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
//        Iterator
        Iterator<Map.Entry<Integer,Human>> iterator = humanLinkedMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Human> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    private static void countWords(String text){
        /*
        Home task: Мапа потрібна містити інформацію про 10 будь-яких слів українською мовою і її переклад на:
        англійську, японську, німецьку. Коли користувач дає мапі слово українською - то потрібен отримати у
        результаті переклад на ці 3 мови.
         */

    }
}
