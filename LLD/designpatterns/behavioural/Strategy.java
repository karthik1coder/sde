package designpatterns.behavioural;

import designpatterns.external.Assasination.Assassinator;

public class Strategy 
{
    private Assassinator assassinator;

    public void setAssassinator(Assassinator assassinator) {
        this.assassinator = assassinator;
    }

    public void executeAssassination(String plan) {
        assassinator.assassinate(plan);
    }
    

    
}