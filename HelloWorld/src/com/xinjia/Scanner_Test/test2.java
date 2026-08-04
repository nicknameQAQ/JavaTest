package com.xinjia.Scanner_Test;

import java.util.Scanner;
//键盘录入两数,并求和
public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数字");
        double num2 = sc.nextDouble();
        System.out.println(num1 + num2);

    }
}
