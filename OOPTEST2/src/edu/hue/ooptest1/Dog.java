package edu.hue.ooptest1;

public class Dog extends Animal{
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    public Dog(){

    }
}
