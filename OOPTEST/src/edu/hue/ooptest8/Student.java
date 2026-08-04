package edu.hue.ooptest8;

public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study(){
        int age = 10;
        System.out.println("局部变量    " + age);
        System.out.println("调用者      " + this.age);
    }
}
