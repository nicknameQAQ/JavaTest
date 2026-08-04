package com.xinjia.Switch_test;
import java.util.Scanner;
public class test1 {
    /*
    * 位置:
    * default 和 case 无 上下之分,位置可以任意书写
    * 为了观看方便,提高可读性
    * 一般case从小到大书写
    * 省略:
    * default可省略不写,所有case都不匹配不输出任何结果
    *
    * case穿透
    * 遇到break才会停
    *
    *
    *
    *
    *
    *
    *
    * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天星期几");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
            break;
            case 2:
                System.out.println("看电影");
            break;
            case 3:
                System.out.println("看书");
                break;
            case 4:
                System.out.println("躺平");
                break;
            case 5:
                System.out.println("健身");
                break;
            case 6:
                System.out.println("11");
                break;
            case 7:
                System.out.println("睡觉");
                break;




        }
    }

}

