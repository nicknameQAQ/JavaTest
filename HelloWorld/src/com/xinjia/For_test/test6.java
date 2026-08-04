package com.xinjia.For_test;

import java.util.Scanner;

public class test6 {
    //求数列之和S(n) = 1 - 2 + 3 - 4 + ...
    static void main(String[] args) {
        //1.键盘录入一个数据,确定是前几项
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2.求和变量
        int sum = 0;
        for (int i = 1;i <= n;i++){
            //判断当下的数是奇数还是偶数
            if (i % 2 == 0){
                //偶数
                sum -= i;
            }else {
                //奇数
                sum += i;
            }
        }
        System.out.println("前" + n + "项和为" + sum);

    }
}
