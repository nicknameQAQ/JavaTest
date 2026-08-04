package com.xinjia.shuzu;

import java.util.Scanner;
//键盘录入一个数看是否在数组里
public class test3 {
    static void main(String[] args) {
        //1.定义一个数组
        int [] arr = {33,5,22,44,55,33};
        boolean found = false;

        //2.键盘录入一个数
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //3.遍历数组是否找到数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                System.out.println("找到了目标数" + num + "该数的索引为" + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("找不到目标数");
        }

    }
}
