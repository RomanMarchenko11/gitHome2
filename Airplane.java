public class Airplane implements Steerable {
    @Override
    public void takeoff() {
        System.out.println("\n1.2. Airplane takeOff");
    }

    @Override
    public void land() {
        System.out.println("2.2. Airplane land");
    }

    @Override
    public void fly() {
        System.out.println("3.2. Airplane fly");
    }

    @Override
    public void steer() {
        System.out.println("4.2. Airplane steer");
    }
    public void turnOnEngine() {
        System.out.println("5.2. Airplane turnEngine");
    }
}
