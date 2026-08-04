package edu.hue.oopextendstest4;

public class Student extends Person{
    public int grade;

    public Student() {
        System.out.println("子类Student的无参构造方法执行了~");
    }
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("子类Student的有参构造方法执行了~");
    }
}
