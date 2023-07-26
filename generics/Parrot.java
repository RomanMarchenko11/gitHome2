package generics;

public class Parrot<N, A extends Number> implements Animal{
    private N name;
    private A age;

    public Parrot(N name, A age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void Voice() {
        System.out.println(name + " voice");
    }
}
