

package designpatterns.creational;

import designpatterns.external.Bike;
import designpatterns.external.Car;
import designpatterns.external.Vehicle;

public class Factory
{

    public Vehicle createVehicle(String type, String color, String model) {
        if (type.equalsIgnoreCase("car")) {
            return new Car(color, model);
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike(color, model);
        }
        return null;
    }
    
}

