package com.xinjia.Continue_Test;

import java.util.Scanner;

public class test3 {
    //包含4或者4的倍数,键盘录入
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            // 条件1：不是4的倍数
            // 条件2：数字中不包含4
            if (i % 4 != 0 && !String.valueOf(i).contains("4")) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 条件1：不是4的倍数
            boolean notBei4 = (i % 4 != 0);
            // 条件2：数字里没有4（只用while和%、/）
            int temp = i;
            boolean has4 = false;
            while (temp > 0) {
                int last = temp % 10; // 取最后一位
                if (last == 4) {
                    has4 = true;
                    break; // 找到4就退出循环
                }
                temp = temp / 10; // 去掉最后一位
            }
            boolean no4 = !has4;

            // 两个条件都满足才输出
            if (notBei4 && no4) {
                System.out.println(i);
            }
        }
    }
}*/
