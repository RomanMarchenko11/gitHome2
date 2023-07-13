public class Car {
    {
        System.out.println("A new car is created!");
    }
    /*
    Домашнє завдання
    1. Створити клас автомобіль та 2 його потомки: легковий та вантажний
    2. У кожному класі повинен бути перевизначений метод, який повертає тип автомобіля
     */
    /* Створіть клас Car, який має такі поля:

        mark (марка автомобіля, строка)
        model (модель, строка)
        year (рік випуску, ціле число)
        */
    String mark;
    String model;
    int year;
    Car (){
        this.mark = "Not specified";
        this.model = "Not specified";
        this.year = 2000;
    }
    Car (String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }
    public void Description() {
        System.out.println("Автомобіль - це транспортний засіб для перевезення пасажирів та вантажів");
    }

    @Override
    public String toString() {
        return "Car{" + "mark = '" + mark + '\'' + ", model ='" + model + '\'' + ", year =" + year + '}';
    }
}
