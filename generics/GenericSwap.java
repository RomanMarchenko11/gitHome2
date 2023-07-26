package generics;
/*
Завдання 1: Генерічний метод для обміну елементів масиву
Напишіть генерічний метод swap(), який приймає масив та індекси двох елементів і обмінює їх місцями.
Використайте цей метод для обміну елементів масиву цілих чисел та рядків.
 */
public class GenericSwap<T> {
    public static <T> void swap(T [] array, int index1, int index2) {
//        validation
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Wrong index");
        } else {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

    }
}
