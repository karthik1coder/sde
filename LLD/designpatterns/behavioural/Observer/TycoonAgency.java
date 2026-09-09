package designpatterns.behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

import designpatterns.external.Person;

public class TycoonAgency implements Subject {


    private Person person;
    
    private List<Observer> observers = new ArrayList<>();
    
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(null);
        }
    }

    public void setPerson(Person person) {
        this.person = person;
        notifyObservers();
    }
    
}
