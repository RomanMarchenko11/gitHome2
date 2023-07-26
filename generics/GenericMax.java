package generics;

/*
Завдання: Обмеження типів для порівняння об'єктів
Напишіть генерічний метод max(), який приймає масив об'єктів та повертає найбільший об'єкт згідно з визначеним
порівнянням.
Використайте обмеження типів, щоб гарантувати, що об'єкти, які передаються у метод max(), реалізують
інтерфейс Comparable.
Протестуйте метод max() з різними типами даних, такими як цілі числа, рядки та інші, які реалізують інтерфейс
Comparable.
 */
public class GenericMax<N> {
    public static <N extends Comparable> N max(N[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Wrong import");
        } else {
            N maxElement = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(maxElement) > 0) {
                    maxElement = array[i];
                }
            } return maxElement;
        } return null;

    }
}
