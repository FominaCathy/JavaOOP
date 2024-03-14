package FominaKat.lesson3.Company;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {
    private Worker(String surName, String name, LocalDate birthDay, double salary) {
        super(surName, name, birthDay, salary);
    }

    public static Worker create(String surName, String name, LocalDate birthDay, double salary){
        return new Worker(surName, name, birthDay, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return String.format("%s %s (%d лет); ставка: %.2f руб.; з/п за месяц: %.2f руб.",
                surName, name, getAge(), salary, calculateSalary());
    }
}
