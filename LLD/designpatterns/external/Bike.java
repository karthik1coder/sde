package designpatterns.external;

public class Bike implements Vehicle {
    private String color;
    private String model;

    public Bike(String color, String model) {
        this.color = color;
        this.model = model;
    }


    public void start() {
        System.out.println("Bike started.");
    }

    public void stop() {
        System.out.println("Bike stopped.");
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}