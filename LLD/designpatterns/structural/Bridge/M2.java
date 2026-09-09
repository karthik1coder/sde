package designpatterns.structural.Bridge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M2 implements Company {


    Map<String, String> buyers = new HashMap<>();

    @Override
    public String getName() {
        return "M2";
    }

    @Override
    public List<String> getBuyers() {
        return List.copyOf(buyers.keySet());
    }

    @Override
    public void addBuyer(String buyer) {
        buyers.put(buyer, buyer);
    }

   
}
