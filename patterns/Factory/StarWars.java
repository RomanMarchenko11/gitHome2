package patterns.Factory;

public class StarWars implements Lego {
    @Override
    public void carCreate() {
        System.out.println("StarCar is ready");
    }

    @Override
    public void shipCreate() {
        System.out.println("StarShip is ready");
    }
}
