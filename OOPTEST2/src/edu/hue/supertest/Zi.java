package edu.hue.supertest;

public class Zi extends Fu{
    String name = "Zi";
    public void show(){
        String name = "Zishow";
        System.out.println("就近原则           " + name);
        System.out.println("用了this关键字本类          " + this.name);
        System.out.println("用了super关键字父类          " + super.name);
        System.out.println(address);
    }
}
