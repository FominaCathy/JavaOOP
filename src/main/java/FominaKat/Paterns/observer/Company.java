package FominaKat.Paterns.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        //рандомно выберем профессию
        int rnd = random.nextInt(0, Profession.values().length);
        Profession need = Profession.values()[rnd];

        System.out.printf("\nОткрыта вакансия -'%s', в компании %s (з/п = %d)\n", need, this.name, salary);
        jobAgency.sendOffer(name, new Vacancy(need, need.toString(), salary));

    }
}
