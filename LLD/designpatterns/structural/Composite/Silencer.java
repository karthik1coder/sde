package designpatterns.structural.Composite;

public class Silencer implements Part {
    
    @Override
    public void display() {
        System.out.println("Silencer Display");
    }

    @Override
    public void function() {
        System.out.println("Silencer Function");
    }
    

}
