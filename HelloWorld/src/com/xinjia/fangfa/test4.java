package com.xinjia.fangfa;

public class test4 {
    //打印九九乘法表
    static void main(String[] args) {
        nine();
        System.out.println("------------------------------------------------------");
        nine2();

    }
    public static void nine(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " ");
            }
            System.out.println();
        }
    }
    public static void nine2(){
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " ");
            }
            System.out.println();
        }
    }
}
