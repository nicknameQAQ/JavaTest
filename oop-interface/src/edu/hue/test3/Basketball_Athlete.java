package edu.hue.test3;

public class Basketball_Athlete extends Athlete {


    @Override
    public void study() {
        System.out.println(getName() + "学习篮球");
    }

    public Basketball_Athlete(String name, int age) {
        super(name, age);
    }

    public Basketball_Athlete() {
    }
}
