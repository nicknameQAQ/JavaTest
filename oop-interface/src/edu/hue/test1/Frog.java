package edu.hue.test1;

public class Frog extends Animal implements Swim{

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    public Frog(String name, String color) {
        super(name, color);
    }

    public Frog() {
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
