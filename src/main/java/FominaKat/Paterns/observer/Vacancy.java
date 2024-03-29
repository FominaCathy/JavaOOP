package FominaKat.Paterns.observer;

public class Vacancy {
    private Profession type;
    private String description;
    private int salary;

    public Vacancy(Profession type, String description, int salary) {
        this.type = type;
        this.description = description;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Vacancy{" + description + ", salary=" + salary + '}';
    }

    public Profession getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getSalary() {
        return salary;
    }
}
