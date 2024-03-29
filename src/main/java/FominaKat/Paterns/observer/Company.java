package FominaKat.Paterns.observer;

import java.util.ArrayList;
import java.util.Random;

public class Company {

    private Random random = new Random();
    private ArrayList<String> staff= new ArrayList<>();
    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        initStaff();
    }

    private void initStaff(){
        staff.add("руководитель");
        staff.add("младший специалист");
        staff.add("стажер");
        staff.add("помощник");
    }


    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        //рандомно выберем профессию
        int rnd = random.nextInt(0, Profession.values().length);
        Profession need = Profession.values()[rnd];
        String description = String.format("%s %s", staff.get(random.nextInt(staff.size())), need.name());
        System.out.printf("\nОткрыта вакансия -'%s', в компании %s (з/п = %d)\n", description, this.name, salary);
        jobAgency.sendOffer(name, new Vacancy(need, description, salary));

    }
}
