package designpatterns.structural.Bridge;

import java.util.List;

interface Company {
    String getName();
    List<String> getBuyers();
    void addBuyer(String buyer);
    

}
