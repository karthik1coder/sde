package designpatterns.behavioural.Observer;

import designpatterns.external.Person;

public class PoliticianNotifier implements Observer {

    
    @Override
    public void update(Person person) {
        System.out.println("Politician notified about the person: " + person);
    }
    
}
