package edu.hue.test3;

public class Pingpong_Athlete extends Athlete implements SpeakEng {
    @Override
    public void speakEng() {
        System.out.println(getName() + "说英语");
    }

    @Override
    public void study() {
        System.out.println(getName() + "学习乒乓球");
    }

    public Pingpong_Athlete(String name, int age) {
        super(name, age);
    }

    public Pingpong_Athlete() {
    }
}
