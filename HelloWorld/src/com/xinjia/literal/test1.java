package com.xinjia.literal;

public class test1 {
    public static void main(String[] args) {
        //计算BMI = 体重 / 身高的平方(kg/m2)

        //1 定义体重
        double weight = 74.4;

        //2 定义身高
        double height = 1.81;

        //3 计算BMI
        double BMI = weight / (height * height);
        System.out.println("BMI = " + BMI);
    }
}
