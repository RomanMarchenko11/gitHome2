package patterns.Factory;

public class LegoFabric {

    public Lego Choice (LegoTypes legoTypes){
        Lego lego;
        switch (legoTypes) {
            case CITY -> lego =new City();
            case MINECRAFT -> lego = new Minecraft();
            case STARWARS -> lego = new StarWars();
            default -> throw new IllegalArgumentException();
        }
        return lego;
    }
}
