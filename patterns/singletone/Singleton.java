package patterns.singletone;

public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;
    public int counter = 10;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void hello() {
        System.out.println("Hello everyone!");
    }
}
