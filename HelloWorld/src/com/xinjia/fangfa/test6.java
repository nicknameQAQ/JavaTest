package com.xinjia.fangfa;

import java.util.Scanner;

public class test6 {
    //计算班级分数
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        int num;//定义一个数临时储存
        int[] arr = new int[10];//定义一个数组
        for (int i = 0; i < 10; ) {
            num = sc.nextInt();
            if (0 <= num && num <= 100) {
                System.out.println("录入成功");
                arr[i] = num;
                i++;
            } else {
                System.out.println("请重新输入,数字要求在0-100之间");
                continue;
            }

        }
        int pass = passNum(arr);
        double passRate = pass / 10;
        int total = totalNum(arr);
        double averTotal = total / 10;
        int max = maxNum(arr);
        System.out.println("及格人数为" + pass);
        System.out.println("及格率为" + passRate);
        System.out.println("总分为" + total);
        System.out.println("平均分为" + averTotal);
        System.out.println("最大值为" + max);


    }
    //求及格人数
    public static int passNum(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 60){
                count++;
            }
        }
        return count;
    }
    //求及格率
    public static double passRate(int num){
        return num / 10;
    }
    //求总分
    public static int totalNum(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    //求最大值
    public static int maxNum(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
