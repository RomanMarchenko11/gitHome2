public class LessonThirteen {
    /*
    Home task:
    Створити набір класів який описує студентів та викладачів за допомогою абстракцій
     */
    
/*
Завдання 1: Абстрактні класи
        Створіть абстрактний клас Fruit з абстрактним методом color().
        Створіть два підкласи Apple та Banana і реалізуйте абстрактний метод color().
        Метод повинен виводити колір фрукта. Наприклад, для Apple він може вивести "The apple is red" або "The apple is green",
         а для Banana - "The banana is yellow".
Завдання 2: Внутрішні класи
        Створіть клас Computer, який має внутрішній клас Processor та внутрішній клас RAM.
        В кожному внутрішньому класі повинні бути приватні поля та методи для встановлення та отримання значень цих полів.
        В класі Computer створіть метод describe(), який виводить інформацію про процесор і оперативну пам'ять.
Завдання 3: Комбіноване використання абстрактних та внутрішніх класів
        Створіть абстрактний клас Building, який має абстрактний метод structure().
        Створіть два підкласи House та Skyscraper і реалізуйте метод structure().
        В кожному підкласі повинен бути внутрішній клас Room, який має приватні поля для опису кімнати та методи для встановлення
        та отримання цієї інформації. У кожному підкласі House та Skyscraper створіть метод describe(), який виводить інформацію про будівлю і кімнати в ній.
Завдання 4: Самостійно
        Створіть абстрактний клас Animal з абстрактним методом sound(). Створіть підкласи Dog,
        Cat та Cow, які реалізують цей метод. Метод sound() повинен виводити звук,
        який робить кожна тварина (наприклад, "Dog barks", "Cat meows", "Cow moos").
     */
public static void main(String[] args) {
//    Home task
    System.out.println("Home Task");
    TeacherAbstract teacher = new TeacherHistory();
    teacher.Subject();
    StudentAbstract student = new StudentHistory();
    student.Subject();

//    Practice on lesson
    System.out.println("\nTask 1: Abstract Fruit class");
    Fruit apple = new Apple();
    Fruit banana = new Banana();

    apple.color();
    banana.color();

    System.out.println("\nTask 2: Internal class");
    Computer computer = new Computer();
    computer.describe();

    System.out.println("\nTask 3: Abstract and Internal classes.");
    Building house = new House(2);
    Building skyscraper = new Skyscraper(25);
    house.Structure();
    skyscraper.Structure();

    System.out.println("\nTask 3: Самостійно.");
    Animals dog = new AnimalsDog();
    dog.Sound();
    Animals cat = new AnimalsCat();
    cat.Sound();
    Animals cow = new AnimalsCow();
    cow.Sound();
}
}
