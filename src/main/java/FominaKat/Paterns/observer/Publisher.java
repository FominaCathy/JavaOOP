package FominaKat.Paterns.observer;

public interface Publisher {
    void sendOffer(String companyName, Vacancy vacancy);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
