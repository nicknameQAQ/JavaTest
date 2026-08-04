package com.xinjia.Scanner_Test;

import java.util.Scanner;

public class test5 {
    //时间转换
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入时间(秒)：");
        int time = sc.nextInt();
        //1.计算小时
        int hour = time / 3600;
        //2.计算分钟
        int minute = (time - hour * 3600) /60;
        //3.计算秒
        int second = time - hour * 3600 - minute * 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
