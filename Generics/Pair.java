package Generics;
/*
Завдання: Параметризований клас Pair
Створіть параметризований клас Pair, який приймає два параметри типу.
Клас повинен мати методи getFirst() та getSecond(), які повертають перший та другий елементи відповідно.
Протестуйте клас Pair, створюючи об'єкти з різними типами даних (наприклад, цілі числа, рядки, об'єкти) та
отримуючи їх значення.
*/
public class Pair<P, T> {
    private T first;
    private P second;
public Pair(T first, P second) {
    this.first = first;
    this.second = second;
    }
    public P getSecond() {
        return second;
    }
    public T getFirst() {
        return first;
    }

    @Override
    public String toString() {
        return "Pair {" +
                "first = " + first +
                ", second = " + second +
                '}';
    }
}
