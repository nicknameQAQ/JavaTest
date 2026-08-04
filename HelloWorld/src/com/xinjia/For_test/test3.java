package com.xinjia.For_test;

public class test3 {
    //求1到100的偶数和
    static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100;i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println( i );
            }
        }
        System.out.println(sum);
    }
}
