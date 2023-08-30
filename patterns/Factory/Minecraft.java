package patterns.Factory;

public class Minecraft implements Lego {
    @Override
    public void carCreate() {
        System.out.println("MineCraftCar is ready");
    }

    @Override
    public void shipCreate() {
        System.out.println("MinecraftShip is ready");
    }
}
