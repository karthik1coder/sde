package designpatterns.structural.Adapter;

public class Pistol implements Shooter {
    @Override
    public void shoot() {
        System.out.println("Pistol shooting...");
    }
    
}
