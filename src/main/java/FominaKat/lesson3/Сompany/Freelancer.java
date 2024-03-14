package FominaKat.lesson3.Сompany;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {

    @Override
    public double calculateSalary() {
        return salary * 20.8 * 8;
    }

    private Freelancer(String surName, String name, LocalDate birthDay, double salary) {
        super(surName, name, birthDay, salary);
    }

    public static Freelancer create(String surName, String name, LocalDate birthDay, double salary) {
        return new Freelancer(surName, name, birthDay, salary);
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return String.format("%s %s (%d лет); почасовая ставка: %.2f руб.; з/п за месяц: %.2f руб.",
                surName, name, getAge(), salary, calculateSalary());
    }
}
