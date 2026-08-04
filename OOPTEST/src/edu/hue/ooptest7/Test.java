package edu.hue.ooptest7;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.study();
        s1.eat();
        s1.sleep();
    }
}
