package edu.hue.test3;

public class Car extends Vehicle {
    public Car(){
        super();
    }
    public Car(String brand, double speed){
        super(brand, speed);
    }
    @Override
    public void move(){
        System.out.println(getBrand() + "正在以" + getSpeed() + "km/h的速度移动");
    }
    public void honk(){
        System.out.println("正在鸣笛");
    }
}
