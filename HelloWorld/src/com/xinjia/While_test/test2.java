package com.xinjia.While_test;

import java.util.Scanner;

public class test2 {
    //数位之和
    static void main(String[] args) {
        //1.键盘录入
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ininumber = number;

        //2.获取number的绝对值
        if (number < 0){
            number = - number;
        }

        //3.定义一个数记录各位和
        int sum = 0;

        //4.开始循环
        while (number > 0){
           sum += number % 10;
           number /= 10;
        }
        System.out.println(ininumber + "所有数位之和为" + sum);

    }

}
