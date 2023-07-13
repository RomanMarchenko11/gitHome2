public class LessonTwelve {
    /*
    Створити клас з усіма блоками для ініціалізації об’єкту в яких потрібно вивести на консоль числа -
    які відображають його порядковий номер ініціалізації
     */

    /*
            практика по ініціалізації :
        Завдання 1: Клас з різними типами конструкторів та блоками ініціалізації

        Створіть клас Car, який має такі поля:

        mark (марка автомобіля, строка)
        model (модель, строка)
        year (рік випуску, ціле число)
        Додайте наступні елементи:

        Конструктор за замовчуванням, який ініціалізує mark та model як "Not specified", а year як 2000.
        Параметризований конструктор, що приймає make, model та year.
        Блок ініціалізації, який виводить повідомлення "A new car is created".
     */
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        System.out.println(car.mark + ", " + car.model + ", " + car.year);
        Car car1 = new Car("Wolskvagen", "Pasat", 2020);
        System.out.println(car1.mark + " " + car1.model + ", " + car1.year);

//        task2
            /*
        Створіть клас Person з наступними полями:

        firstName (ім'я)
        lastName (прізвище)
        age (вік)
        Перевизначте метод equals(), таким чином, що дві особи будуть вважатися рівними,
         якщо їх імена, прізвища і вік співпадають.

        Перевизначте метод hashCode() відповідно до вашого методу equals().
     */
        Person person1 = new Person();
        Person person2 = new Person();

        person1.firstName = "Taras";
        person1.lastName = "Bylba";
        person1.age = 35;

        person2.firstName = "Taras";
        person2.lastName = "Bylba";
        person2.age = 35;

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());


//        Домашнє завдання - Tree -> Cherry
        System.out.println("--------------");
        System.out.println("Home Task - initialization");
        System.out.println("--------------");
        Cherry cherry = new Cherry();
        System.out.println("--------------");
        Tree cherry1 = new Cherry();
        System.out.println("--------------");
        Tree cherry2 = new Tree();
    }
}
