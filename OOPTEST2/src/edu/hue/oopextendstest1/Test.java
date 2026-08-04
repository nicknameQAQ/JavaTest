package edu.hue.oopextendstest1;

public class Test {
    public static void main(String[] args) {
        //创建安卓手机对象
        Android a1 = new Android();
        a1.brand = "小米";
        a1.price = 2000;
        System.out.println(a1.brand);
        System.out.println(a1.price);
        a1.NFC();
        a1.call();
        a1.sendMessage();
        //创建苹果手机对象
        ios i1 = new ios();
        i1.brand = "苹果";
        i1.price = 3000;
        System.out.println(i1.brand);
        System.out.println(i1.price);
        i1.call();
        i1.sendMessage();
        //创建笔记本对象
        Laptop l1 = new Laptop();
        l1.brand = "戴尔";
        l1.price = 4000;
        System.out.println(l1.brand);
        System.out.println(l1.price);
        l1.vibecoding();
    }
}
