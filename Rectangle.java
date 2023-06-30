public class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("Extend Area: " + super.widht * super.lenght * 3);
    }
}
