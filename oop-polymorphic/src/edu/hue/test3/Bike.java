package edu.hue.test3;

public class Bike extends Vehicle {
    public Bike(){
        super();
    }
    public Bike(String brand, double speed){
        super(brand, speed);
    }
    @Override
    public void move(){
        System.out.println(getBrand() + "正在以" + getSpeed() + "km/h的速度移动");
    }
    public void ringBell(){
        System.out.println("正在响铃");
    }

}
