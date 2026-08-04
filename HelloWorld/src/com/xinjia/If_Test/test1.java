package com.xinjia.If_Test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        //1.计算BMI
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高(单位m)");
        double height = sc.nextDouble();
        System.out.println("请输入体重(单位kg)");
        double weight = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("BMI = " + BMI);
        //2.判断区间
        if (BMI < 18.5) {
            System.out.println("身体状态: 消瘦");

        }
        else if (BMI >= 18.5 && BMI < 23.9){
            System.out.println("身体状态: 正常");

        }
        else if (BMI >= 23.9 && BMI <=26.9){
            System.out.println("身体状态: 偏胖");

        }
        else if (BMI >= 26.9 && BMI <=29.9){
            System.out.println("身体状态: 肥胖");

        }
        else if (BMI >= 30){
            System.out.println("身体状态: 严重肥胖");

        }
    }


}
