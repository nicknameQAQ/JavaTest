package edu.hue.test3;

public class Basketball_Coach extends Coach {
    @Override
    public void teach() {
        System.out.println(getName() + "教篮球");
    }

    public Basketball_Coach(String name, int age) {
        super(name, age);
    }

    public Basketball_Coach() {
    }
}
