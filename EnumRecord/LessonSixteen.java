package EnumRecord;

import java.util.Arrays;

/*
        Завдання 2: Використання методів Enum
        Використовуючи Enum DayOfWeek з першого завдання, виведіть всі дні тижня, використовуючи метод values().
        Виведіть ordinal число для WEDNESDAY.

        Завдання 3: Створення Enum з додатковими полями та методами
        Створіть Enum Month, який містить всі місяці року, а також додайте поле days, що показує кількість днів в місяці.
        Додайте метод getDays(), що повертає кількість днів в місяці.
        Створіть клас Test з main методом, в якому ви виведете кількість днів в FEBRUARY.

        Завдання 4: Enum та switch statement
        Створіть метод, який приймає DayOfWeek та друкує різні повідомлення залежно від дня тижня, використовуючи switch statement.

        Завдання 5: Enum в колекціях

        //too deep
        Створіть HashMap<DayOfWeek, String>, де ключ - це день тижня, а значення - деяка діяльність, яку ви плануєте виконати цього дня.
        Заповніть цю мапу даними, а потім проітеруйте її та виведіть діяльність для кожного дня.
     */
public class LessonSixteen {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("Task 1 - day of week");
        WeekDays[] day = WeekDays.values();
        System.out.println(Arrays.toString(day));
        WeekDays todayDay = WeekDays.Wednesday;
        switch (todayDay) {
            case Monday -> System.out.println("Today is " + todayDay );
            case Tuesday -> System.out.println("Today is " + todayDay );
            case Wednesday -> System.out.println("Today is " + todayDay );
            case Thursday -> System.out.println("Today is " + todayDay );
            case Friday ->  System.out.println("Today is " + todayDay );
            case Saturday -> System.out.println("Today is " + todayDay );
            case Sunday -> System.out.println("Today is " + todayDay );
        }
//        Основні методи: values(), valueOf(), ordinal() - повертає індекс масиву (розташування перечислення)
        int friday = WeekDays.Friday.ordinal();
        System.out.println("Index Friday in Enum:" + friday);
        System.out.println("---------------------------------------------------------");
        System.out.println("Task 2 - Seasons");
//        Enum Season
        Season season = Season.SUMMER;
        System.out.println(season + " is " + season.getDescription());
        System.out.println("---------------------------------------------------------");
//        Month and days in Month
        System.out.println("Task 3 - Month and quantity of days");
        Month month = Month.JULY;
        System.out.println(month + " " + month.getDays());
        System.out.println(month.getDays());
        System.out.println(Arrays.toString(Month.values()));
//        Records
        System.out.println("---------------------------------------------------------");
        System.out.println("What does Record have to do?");
        StudentCard[] studentGroup = new StudentCard[5];
        studentGroup[0] = new StudentCard("Vasiliy", "Petrov", 2, 5.5);
        studentGroup[1] = new StudentCard("Andriy", "Smirnov", 2, 6.5);
        studentGroup[2] = new StudentCard("Anton", "Rigov", 2, 5.0);
        studentGroup[3] = new StudentCard("Vladislav", "Zibrov", 2, 7.0);
        studentGroup[4] = new StudentCard("Ryslan", "Netam", 2, 4.0);



    }
}
