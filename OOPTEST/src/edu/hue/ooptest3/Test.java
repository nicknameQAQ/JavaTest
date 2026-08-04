package edu.hue.ooptest3;

public class Test {
    static void main(String[] args) {
        Teacher t = new Teacher();
        t.age = 18;
        t.name = "万万";
        System.out.println(t.age);
        System.out.println(t.name);
        t.eat();
        t.read();
    }
}
