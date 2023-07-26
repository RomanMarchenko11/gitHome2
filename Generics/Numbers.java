package Generics;

public class Numbers implements Comparable<Integer>{
    private int number;

    public Numbers(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Integer other) {

        if (number > other) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
