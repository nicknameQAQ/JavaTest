package edu.hue.ooptest6;
class Student {
    /*
      属性: 姓名年龄身高体重
      行为: 学习*/
    private String name;
    private int age;
    private double height;//单位用cm
    private double weight;//单位用kg

    public void setAge(int age1) {
        if (age1 > 0 && age1 <= 100) {
            age = age1;
        }
    }
    public int getAge(){
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    void study(){
        System.out.println("学习");
    }
}
