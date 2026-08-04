package edu.hue.oopextendstest3;

public class Test {
    public static void main(String[] args) {
        //测试Phone类
        Phone p1 = new Phone();
        p1.name = "小米14";
        p1.price = 3999;
        System.out.println(p1.payment());
    }
}
