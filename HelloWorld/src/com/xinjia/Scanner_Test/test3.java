package com.xinjia.Scanner_Test;

import java.util.Scanner;

//用键盘录入的方式计算BMI
public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重(单位kg)：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高(单位m)：");
        double height = sc.nextDouble();
        System.out.println("您的BMI为" + weight/(height * height));
    }
}
