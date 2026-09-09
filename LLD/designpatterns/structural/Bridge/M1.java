package designpatterns.structural.Bridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M1 implements Company {

    

    private Map<String, String> buyers = new HashMap<>();
    
    @Override
    public String getName() {
        return "M1";
    }

   @Override
    public List<String> getBuyers() {
        return new ArrayList<>(buyers.keySet());
    }

    @Override
    public void addBuyer(String buyer) {
        buyers.put(buyer, buyer);
    }
    
}
