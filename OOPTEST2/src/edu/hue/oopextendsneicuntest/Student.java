package edu.hue.oopextendsneicuntest;

public class Student extends Person {
    public String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student() {
        super();

    }
}
