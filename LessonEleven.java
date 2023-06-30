import java.util.Scanner;

public class LessonEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Завдання 1 - класна робота.");
        System.out.println("Завдання 2 - домашня робота.");
        System.out.print("Зробіть вибір завдання: ");
        int task = scanner.nextInt();
        switch (task) {
            case 1 -> {
                Circle circle = new Circle();
                Shape circle1 = new Shape();
                Shape circle2 = new Circle();

                Rectangle rectangle = new Rectangle();
                Shape rectangle1 = new Rectangle();
                Shape rectangle2 = new Shape();

                System.out.println("0");
                circle.area();
                System.out.println("1");
                circle1.area();
                System.out.println("2");
                circle2.area();
                System.out.println("---------------------");

                rectangle.area();
                rectangle1.area();
                rectangle2.area();
            }
            case 2 -> {
                Car sedan = new Car();
                Car sedan1 = new Sedan();
                Sedan sedan2 = new Sedan();

                Car truck = new Car();
                Car truck1 = new TruckCar();
                TruckCar truck2 = new TruckCar();

                System.out.println("Автомобілі легкові та вантажні");
                System.out.println("------------------------------");
                sedan.Description();
                sedan1.Description();
                sedan2.Description();
                System.out.println("------------------------------------------------------------------------");
                truck.Description();
                truck1.Description();
                truck2.Description();
            }
            default -> System.out.println("До наступного разу!");
        }
    }
}
