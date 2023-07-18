package Generics;

public class Animals<A extends Animal> {
    private A animal;

    public void voiceAnimal() {
        animal.Voice();
    }

    public A getAnimal() {
        return animal;
    }

    public void setAnimal(A animal) {
        this.animal = animal;
    }
}
