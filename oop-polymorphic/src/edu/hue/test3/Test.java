package edu.hue.test3;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三", 20, "男");
        System.out.println(person.getName() + person.getAge() + person.getGender());
        Bike bike = new Bike("自行车", 10);
        Car car = new Car("奔驰", 100);
        person.drive(car);
    }
}
