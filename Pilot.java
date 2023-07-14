public class Pilot extends Human{
    @Override
    public void Fly() {
        System.out.println("I can fly airplanes");
    }

    @Override
    public void Drive() {
        System.out.println("Я не вмію водити машини.");
    }
}
