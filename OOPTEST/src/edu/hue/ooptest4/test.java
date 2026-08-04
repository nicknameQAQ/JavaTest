package edu.hue.ooptest4;

public class test {
    public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    p1.setName("wanwan");
    p1.setAge(18);
    p2.setName("xinxin");
    p2.setAge(99);
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
    }
}
