package enumRecord;

public enum Season {
    WINTER("Cold"),
    SPRING("Warmer"),
    SUMMER("Hot"),
    AUTUMN("Cooler");
    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
