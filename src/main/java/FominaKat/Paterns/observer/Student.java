package FominaKat.Paterns.observer;

import java.util.Random;

public class Student implements Observer {

    private String name;
    private int salary;
    private Profession profession;


    public Student(String name) {
        this.name = name;
        salary = 5000;

        //рандомно выберем профессию
        Random random = new Random();
        int rnd = random.nextInt(0, Profession.values().length);
        this.profession = Profession.values()[rnd];

    }

    public Profession getProfession(){
        return profession;
    }

    @Override
    public void receiveOffer(Publisher publisher, String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            System.out.printf("Студент (%s) %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                   profession.name(), name, nameCompany, vacancy.getSalary());
            this.salary = vacancy.getSalary();
            publisher.removeObserver(this);

        } else {
            System.out.printf("Студент (%s) %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    profession.name(), name, nameCompany, vacancy.getSalary());
        }
    }

}
