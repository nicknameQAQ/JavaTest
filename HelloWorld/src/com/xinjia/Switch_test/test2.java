package com.xinjia.Switch_test;

import java.util.Scanner;

public class test2 {
    //键盘录入月份,打印属于哪个季节
    //利用case穿透
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("该月份不存在");
*/
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch (month) {
            case 3,4,5 -> System.out.println("春季");
            case 6,7,8 -> System.out.println("夏季");
            case 9,10,11 -> System.out.println("秋季");
            case 12,1,2 -> System.out.println("冬季");
            default -> System.out.println("该月份不存在");*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        String name = switch (month) {
            //如果只有一行,大括号可以省略,yield也可以省略,只有箭头
            case 3,4,5 -> {
                yield  "春季";
            }
            case 6,7,8 -> {
                yield "夏季";
            }
            case 9,10,11 -> {
                yield "秋季";
            }
            case 12,1,2 ->  {
                yield "冬季";
            }
            default -> {
                yield    "该月份不存在";
            }
        };
        System.out.println(name);
    }

}
