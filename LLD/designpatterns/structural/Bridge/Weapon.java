package designpatterns.structural.Bridge;


abstract class Weapon {


    protected Company company;

    
    abstract void attack();

    public void TagWeapon(Company company) {
        this.company = company;
    }

    public Weapon(Company company) {
        this.company = company;
    }

}