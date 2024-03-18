package FominaKat.Company;

import java.time.LocalDate;

public abstract class Employee implements Comparable<Employee> {
    /**
     * День рождения (добавила)
     */
    protected LocalDate birthDay;

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0) {
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    /**
     * получение кол-ва полных лет
     * @return
     */
    public int getAge() {
        LocalDate currentDay = LocalDate.now();
        if ((currentDay.getMonthValue() >= birthDay.getMonthValue())
                && (currentDay.getDayOfMonth() >= birthDay.getDayOfMonth())) {
            return currentDay.getYear() - birthDay.getYear();
        } else {
            return currentDay.getYear() - birthDay.getYear() - 1;
        }

    }

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;


    /**
     * Расчет среднемесячной заработной платы
     *
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    public Employee(String surName, String name, LocalDate birthDay, double salary) {
        this.surName = surName;
        this.name = name;
        this.birthDay = birthDay;
        this.salary = salary;
    }


}
