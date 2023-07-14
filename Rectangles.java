public class Rectangles implements GeometricShape{
    /*
    Підказка з формулами:
Для прямокутника: Площа = ширина * висота
Периметр = 2 * (ширина + висота)
     */
    private int l;
    private int b;

    public Rectangles(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area rectangle: " + l * b);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter rectangle: " + 2 * (l + b));
    }
}
