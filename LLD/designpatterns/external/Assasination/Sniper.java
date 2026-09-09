package designpatterns.external.Assasination;

import designpatterns.external.Person;
import java.util.ArrayList;
import java.util.List;

public class Sniper implements Assassinator {

    List<Person> assassins = new ArrayList<>();
    
    @Override
    public Person assassinate(String plan) {
        return null;
    }

    @Override
    public void addAssassin(Person assassin) {
        assassins.add(assassin);
    }

    @Override
    public void deleteAssassin(Person assassin) {
        assassins.remove(assassin);
    }
}
