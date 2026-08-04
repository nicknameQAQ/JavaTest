package com.xinjia.For_test;

import java.util.Scanner;

public class test4 {
    //输入左右范围,统计这个范围中既能被3整除又能被5整除的数有多少个
    /*static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        int sum = 0;
        for(int i = left;i <= right;i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println("既能被3整除又能被5整除的数有" + sum + "个");*/
    static void main(String[] args) {
        //1.键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        int count = 0;

        //2.求两个数字最大最小值
        int max = num1 > num2 ? num1 : num2;
        int min = num1 > num2 ? num2 : num1;

        //3.循环获取min到max直接的每个数字
        for (int i = min;i <= max;i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                count ++;
            }

    }
        System.out.println("共有" + count + "个数字");




    }
}
