package FominaKat.Paterns.observer;

import java.util.Random;

public class Worker implements Observer {

    private String name;
    private int salary;
    private Profession profession;

    public Worker(String name) {
        this.name = name;
        this.salary = 50000;

        //рандомно выберем профессию
        Random random = new Random();
        int rnd = random.nextInt(0, Profession.values().length);
        this.profession = Profession.values()[rnd];
    }

    public Profession getProfession() {
        return profession;
    }



    @Override
    public void receiveOffer(Publisher publisher, String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            System.out.printf("Рабочий (%s) %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    profession.name(), name, nameCompany, vacancy.getSalary());
            this.salary = vacancy.getSalary();
            publisher.removeObserver(this);


        } else {
            System.out.printf("Рабочий (%s) %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    profession.name(), name, nameCompany, vacancy.getSalary());
        }
    }


}
