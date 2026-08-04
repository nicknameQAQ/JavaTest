package com.xinjia.Scanner_Test;

import java.util.Scanner;

public class test4 {
    //键盘录入一个三位数,将其拆分为个位,十位,百位后打印到控制台
    public static void main(String[] args){
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        //2.拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        //int qianwei = num /1000 % 10;
        //3.打印
        System.out.println("个位:" + ge);
        System.out.println("十位:" + shi);
        System.out.println("百位:" + bai);
    }
}
