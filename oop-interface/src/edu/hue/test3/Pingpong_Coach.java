package edu.hue.test3;

public class Pingpong_Coach extends Coach implements SpeakEng {
    @Override
    public void teach() {
        System.out.println(getName() + "教乒乓球");
    }

    @Override
    public void speakEng() {
        System.out.println(getName() + "说英语");
    }

    public Pingpong_Coach(String name, int age) {
        super(name, age);
    }

    public Pingpong_Coach() {
    }
}
