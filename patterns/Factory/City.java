package patterns.Factory;

public class City implements Lego {
    @Override
    public void carCreate() {
        System.out.println("CityCar is ready");
    }

    @Override
    public void shipCreate() {
        System.out.println("CityShip is ready");
    }
}
