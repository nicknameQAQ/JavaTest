package edu.hue.oopextendstest5;

public class Zteacher extends  Teacher{
    @Override
    public void teach() {
        System.out.println("在教学专业课知识");
    }

    public Zteacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public Zteacher() {
    }
}
