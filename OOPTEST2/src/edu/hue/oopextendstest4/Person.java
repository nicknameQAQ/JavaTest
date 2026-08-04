package edu.hue.oopextendstest4;

public class Person {
    public String name;
    public int age;
    public Person(){
        System.out.println("父类的无参构造方法执行了~");
    }
    public Person(String name, int age) {
        System.out.println("父类的有参构造方法执行了~");
        this.name = name;
        this.age = age;
    }


}
