package FominaKat.lesson3.Сompany;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Volonter extends Employee {
    private static int price = 2000; // у них нет з/п, только вознаграждение которое фиксирована для всех

    private Volonter(String surName, String name, LocalDate birthDay) {
        super(surName, name, birthDay, price);
    }

    public static Volonter create(String surName, String name, LocalDate birthDay) {
        return new Volonter(surName, name, birthDay);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return String.format("%s %s (%d лет); вознаграждение: %.2f руб.; вознаграждение за месяц: %.2f руб.",
                surName, name, getAge(), salary, calculateSalary());
    }
}
