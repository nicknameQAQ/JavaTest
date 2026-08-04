package edu.hue.test3;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {

    }
    public void drive(Vehicle vehicle){
        vehicle.move();
        if(vehicle instanceof Car){
           Car car = (Car) vehicle;
           car.honk();
        }
        else if(vehicle instanceof Bike){
            Bike bike = (Bike) vehicle;
            bike.ringBell();

        }else {
            System.out.println("未知的车辆类型");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
