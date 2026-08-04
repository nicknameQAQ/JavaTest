package edu.hue.oopextendstest5;

public class Bstudent extends Student{
    //本科学生
    @Override
    public void study(){
        System.out.println("在攻读本科");
    }

    public Bstudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    public Bstudent() {
    }
}
