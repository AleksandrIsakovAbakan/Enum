public enum Gender {
    MAN("мужчина"),
    WOMAN("женщина");

    private final String type;

    Gender(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
