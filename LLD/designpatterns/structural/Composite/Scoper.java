package designpatterns.structural.Composite;

public class Scoper implements Part {
    @Override
    public void display() {
        System.out.println("Scoper display");
    }

    @Override
    public void function() {
        System.out.println("Scoper function");
    }
    
}
