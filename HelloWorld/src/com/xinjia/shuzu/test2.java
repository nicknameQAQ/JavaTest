package com.xinjia.shuzu;

import java.util.Scanner;
public class test2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //动态初始化
        int arr [] = new int [5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入一个整数");
            int num = sc.nextInt();
            arr[i] = num;
        }
    }
}
