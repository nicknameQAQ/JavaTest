package edu.hue.ooptest1;

import javax.naming.Name;

public class Animal {
    String name;
    int age;
    public void shout(){
        System.out.println("喵喵喵----");
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
