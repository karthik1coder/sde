package designpatterns.behavioural.State;

import java.util.List;

public class Raichu implements Level {
    
    @Override
    public List<Attack> getAttacks() {
        return null;
    }

    @Override
    public void addAttack(Attack attack) {

    }

    public void nextState(Pokemon pokemon)
    {
        System.out.println("Raichu is the final evolution");
    }

    public void previousState(Pokemon pokemon)
    {
        pokemon.level = new Pikachu();   
    }
    
}
