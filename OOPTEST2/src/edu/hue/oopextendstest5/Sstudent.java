package edu.hue.oopextendstest5;

public class Sstudent extends Student{
    //硕士学生学习
    @Override
    public void study(){
        System.out.println("在攻读硕士");
    }

    public Sstudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    public Sstudent() {
    }
}
