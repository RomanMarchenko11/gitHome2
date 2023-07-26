package Generics;

public class Human <T extends Hobby> {
    private T hobby;

    public T getHobby() {
        return hobby;
    }

    public void setHobby(T hobby) {
        this.hobby = hobby;
    }

    public void runHobby() {
        hobby.run();
    }
}
