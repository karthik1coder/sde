package designpatterns.behavioural.State;

import java.util.List;

public class Pichu implements Level {
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
        pokemon.level = new Pikachu();   
    }

    public void previousState(Pokemon pokemon)
    {
        System.out.println("Pichu is the first evolution");
    }

    
}
