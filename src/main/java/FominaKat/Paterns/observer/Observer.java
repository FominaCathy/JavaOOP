package FominaKat.Paterns.observer;

public interface Observer {

    Profession getProfession();

    void receiveOffer(Publisher publisher, String nameCompany, Vacancy vacancy);


}
