package edu.hue.oopextendstest5;

public class Tteacher extends Teacher {
    @Override
    public void teach(){
        System.out.println("在教学通识课知识");
    }

    public Tteacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public Tteacher() {
    }
}
