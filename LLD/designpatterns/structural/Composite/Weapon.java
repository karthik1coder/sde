package designpatterns.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Weapon implements Part {
    
    List<Part> parts = new ArrayList<>();

    @Override
    public void display() {
        for(Part part : parts) {
            part.display();
        }
    }

    @Override 
    public void function()
    {
        System.out.println("Weapon is functioning");
        for(Part part : parts) {
            part.function();
        }
    }
    
}
