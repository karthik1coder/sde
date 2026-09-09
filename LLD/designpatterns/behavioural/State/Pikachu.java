package designpatterns.behavioural.State;

import java.util.List;

public class Pikachu implements Level {
    
    List<Attack> attacks;

    @Override
    public List<Attack> getAttacks() {
        return attacks;
    }

    public void addAttack(Attack attack) {
        attacks.add(attack);
    }

    public void nextState(Pokemon pokemon)
    {
        pokemon.level = new Raichu();   
    }

    public void previousState(Pokemon pokemon)
    {
        pokemon.level = new Pichu();   
    }
}
