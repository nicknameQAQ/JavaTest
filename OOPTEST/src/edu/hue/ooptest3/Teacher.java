package edu.hue.ooptest3;

public class Teacher{
    String name;
    int age;
    //行为用方法来定义,但是不用static
    public void eat(){
        System.out.println("老师在吃饭");
    }
    public void read(){
        System.out.println("老师在读书");
    }
}
