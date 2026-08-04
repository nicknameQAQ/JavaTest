package edu.hue.test1;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }
    @Override
    public void swim() {
        System.out.println("狗刨");
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    public Dog() {
    }
}
