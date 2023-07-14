public class Circles implements GeometricShape {
    /*
    Підказка з формулами:
    Площа = π * (радіус^2)
    Периметр (або довжина кола) = 2 * π * радіус
     */

    public Circles(int radius) {
        this.radius = radius;
    }

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private final double pi = 3.14;
    @Override
    public void calculateArea() {
        System.out.println("Area circle: " + pi * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter circle: " + 2 * pi * radius);
    }
}
