package designpatterns.structural.Bridge;


public class Gun extends Weapon {

    Gun(Company company) {
        super(company);
    }

    public void attack() {
        System.out.println("Gun attacking...");
    }
}
