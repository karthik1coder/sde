package designpatterns.structural.Bridge;

public class Sword extends Weapon {

    public Sword(Company company) {
        super(company);
    }

    public void attack() {
        System.out.println("Sword attacking...");
    }
}
