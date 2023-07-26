package generics;

public class Cat<N,A extends Number> implements Animal{
    private N name;
    private A age;

    public Cat(N name, A age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void Voice() {
        System.out.println(name + " voice");
    }
}
