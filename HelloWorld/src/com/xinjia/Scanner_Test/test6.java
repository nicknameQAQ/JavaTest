package com.xinjia.Scanner_Test;

import java.util.Scanner;

public class test6 {
    //判断四位整数是否为回文数
    /*
    回文数是指一个数字从左到右读和从右到左读是相同的。比如：

    - 121 是回文数（正读反读都是 121）
    - 12321 是回文数
    - 123 不是回文数（反读是 321）

    常见的回文数有：11、22、33、121、131、1221 等。
     */
    public static void main(String[] args){
        //请输入一个四位整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数");
        int number = sc.nextInt();


        //检验是否为回文数
        int qian = number / 1000;
        int bai = number / 100 % 10;
        int shi = number / 10 % 10;
        int ge = number % 10;
        /*int number1 = qian * 10 + bai;
        int number2 = ge * 10 + shi;
        if(number1 == number2)
            System.out.println(number + "是回文数");
        else
            System.out.println(number + "不是回文数");*/
        if (qian == ge && shi == bai)
            System.out.println(number + "是回文数");
        else
            System.out.println(number + "不是回文数");
    }

}
