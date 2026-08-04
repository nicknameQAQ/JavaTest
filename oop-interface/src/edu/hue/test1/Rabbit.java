package edu.hue.test1;

public class Rabbit extends Animal{

    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }

    public Rabbit(String name, String color) {
        super(name, color);
    }

    public Rabbit() {
    }

}
