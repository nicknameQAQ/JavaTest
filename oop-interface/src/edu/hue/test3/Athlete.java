package edu.hue.test3;

public abstract class Athlete extends Person {
    public Athlete(String name, int age) {
        super(name, age);
    }

    public Athlete() {
        super();
    }
    public abstract void study();

}
