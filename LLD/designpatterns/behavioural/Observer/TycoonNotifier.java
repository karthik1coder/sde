package designpatterns.behavioural.Observer;
import designpatterns.external.Person;

public class TycoonNotifier implements Observer {

    @Override
    public void update(Person person) {
        System.out.println("Tycoon notified about the person: " + person);
    }
}