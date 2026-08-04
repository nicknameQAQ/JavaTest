package com.xinjia.test;
import java.util.Scanner;

public class zhishu {
    //输入一个大于等于2的整数,判断其是否为质数
    static void main(String[] args) {
        //1.键盘录入
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个大于等于2的整数");
            num = sc.nextInt();
            if (num >= 2){
                break;
            }
            else {
                System.out.println("当前输入的数字不合法请重新输入");
            }
        }
        boolean result = true;
        //2.判断是否为质数
        //num平方根效率更高
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                System.out.println(i);
                result = false;
                break;
            }else {
                result = true;
            }
        }
        if (result == true){
            System.out.println(num + "是质数");
        }else {
            System.out.println(num + "不是质数");
        }


    }
}
