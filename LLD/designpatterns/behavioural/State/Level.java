package designpatterns.behavioural.State;

import java.util.List;

public interface Level
{
    List <Attack> getAttacks();
    void addAttack(Attack attack);
    void nextState(Pokemon pokemon);
    void previousState(Pokemon pokemon);
}
