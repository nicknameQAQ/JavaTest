package com.xinjia.shuzu;

import java.util.Random;

public class Random_Test {
    static void main(String[] args) {
        Random r = new Random();

// 生成 [0, 10) 的随机数，即 0-9
        int num1 = r.nextInt(10);

// 生成 [1, 10] 的随机数（包含 1 和 10）
        int num2 = r.nextInt(10) + 1;  // [0,10) + 1 = [1,10]

// 生成 [min, max] 范围的随机数（通用公式）
        int min = 5;
        int max = 15;
        int num3 = r.nextInt(max - min + 1) + min;  // [5, 15]
        /*Random r = new Random();

// 生成 [0.0, 1.0) 的随机小数
        double d1 = r.nextDouble();

// 生成 [0.0, 100.0) 的随机小数
        double d2 = r.nextDouble() * 100;

// 生成 [10.0, 50.0) 的随机小数
        double d3 = r.nextDouble() * (50 - 10) + 10;  // [10, 50)
*/
    }
}
