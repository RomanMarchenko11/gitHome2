public class LessonFourteen {
    public static void main(String[] args) {
        System.out.println("Home task");
        Human driver = new Driver();
        driver.Drive();
        driver.Fly();
        Human pilot = new Pilot();
        pilot.Drive();
        pilot.Fly();

        System.out.println("\nTask 1");
        GeometricShape rectangle = new Rectangles(4,5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        GeometricShape circle = new Circles(3);
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println("\nTask 2");
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.Sleep();
        dog.Eat();
        cat.Sleep();
        cat.Eat();
        bird.Sleep();
        bird.Eat();

        System.out.println("\nTask 3");
        FlyingObject airplane = new Airplane();
        Steerable airplane2 = new Airplane();
        Airplane airplane3 = new Airplane();
        airplane.takeoff();
        airplane.land();
        airplane.fly();
        airplane2.takeoff();
        airplane2.land();
        airplane2.fly();
        airplane2.steer();
        airplane3.takeoff();
        airplane3.land();
        airplane3.fly();
        airplane3.steer();
        airplane3.turnOnEngine();

        Birds birds = new Birds();
        birds.takeoff();
        birds.land();
        birds.fly();
        birds.steer();
        birds.nest();

        System.out.println("\nTask 4 - Інтерфейс Comparable");
        Studentt stud1 = new Studentt("Artem", 55 );
        Studentt stud2 = new Studentt("Bogdan", 55);
        Studentt stud3 = new Studentt();
        stud3.setName("Viktor");
        stud3.setGradePointAverage(60);
        stud1.compareTo(stud2);
        stud1.compareTo(stud3);
        stud2.compareTo(stud3);
    }
}
