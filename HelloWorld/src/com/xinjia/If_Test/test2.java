package com.xinjia.If_Test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        /*
        键盘录入三个小数判断是否为三角形
        随后判断三角形属于什么类型
        直角,等腰(等边),普通,无
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意三个小数构成三角形的三条边");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        //1.先判断是否构成三角形
        //应该先写范围小的再写范围大的,等边 < 等腰
        if (a + b >= c && a +c >= b && b + c >= a ) {
            if (a == b && b == c){
                System.out.println("构成等边三角形");
            } else if (a == b || a == c || b == c) {
                System.out.println("构成等腰三角形");

            } else if (a * a + b * b == c * c || b * b + c * c == a * a
                    || a * a + c * c == b * b) {
                System.out.println("构成直角三角形");

            }else System.out.println("不构成三角形");

        }
        /*//2.判断三角形类型
            //(1)等腰
            if (a == b || a == c || b == c){
                System.out.println("构成等腰三角形");
            //(2)等边
                if (a == b && a == c)
                    System.out.println("构成等边三角形");
                }
            //(3)直角(锐角钝角暂无法判断)
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("构成直角三角形");
            }
             else System.out.println("不构成三角形");
            }
*/

    }
}






