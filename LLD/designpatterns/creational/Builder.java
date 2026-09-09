package designpatterns.creational;


import java.util.ArrayList;



public class Builder 
{
    private String name;
    private int age;
    private double height;
    private double weight;

    private ArrayList<String> hobbies;
    

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setHeight(double height) {
        this.height = height;
        return this;
    }

    public Builder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Builder setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }
}