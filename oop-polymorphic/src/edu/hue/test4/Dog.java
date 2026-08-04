package edu.hue.test4;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }


    @Override
    public void eat() {
        System.out.println(getName() + "正在吃狗粮");
    }
    //狗看家
    public void watchHome(){
        System.out.println(getName() + "正在看家");
    }
}
