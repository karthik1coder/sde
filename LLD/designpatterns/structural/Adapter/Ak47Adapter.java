package designpatterns.structural.Adapter;

public class Ak47Adapter implements Shooter {
    
    private Ak47 ak47;
    
    public Ak47Adapter(Ak47 ak47) {
        this.ak47 = ak47;
    }
    
    @Override
    public void shoot() {
        ak47.trigger();
    }
}