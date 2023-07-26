package Generics;

public class Text implements Comparable<String> {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public int compareTo(String other) {
//        логіка порівняння рядків
        return 0;
    }
}
