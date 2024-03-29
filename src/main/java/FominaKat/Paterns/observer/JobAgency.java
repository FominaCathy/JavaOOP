package FominaKat.Paterns.observer;

import java.util.*;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();
    private Collection<Observer> removed = new ArrayList<>();

    public void sendOffer(String companyName, Vacancy vacancy) {
        updateObservers();
        for (Observer observer : observers) {
            if (observer.getProfession().equals(vacancy.getType()))
                observer.receiveOffer(this, companyName, vacancy);
        }
    }

    private void updateObservers(){
        if (!removed.isEmpty()) {
            for (Observer observer : removed)
            observers.remove(observer);
        }
        removed.clear();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        removed.add(observer);
     }
}

