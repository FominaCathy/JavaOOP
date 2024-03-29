package FominaKat.Paterns.observer;

public enum Profession {
    DevOps("девопс-инженер"),
    Cook("повар"),
    Builder("строитель");

    private String description;

    Profession(String description) {
        this.description = description;

    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.name(), this.description);
    }
}
