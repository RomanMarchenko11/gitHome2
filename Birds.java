public class Birds implements Steerable{
    @Override
    public void takeoff() {
        System.out.println("\n1 - Bird takeOff");
    }

    @Override
    public void land() {
        System.out.println("2 - Bird land");
    }

    @Override
    public void fly() {
        System.out.println("3 - Bird fly");
    }

    @Override
    public void steer() {
        System.out.println("4 - Bird steer");
    }
    public void nest(){
        System.out.println("5 - Bird nest");
    }
}
