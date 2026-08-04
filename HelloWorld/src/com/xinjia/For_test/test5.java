package com.xinjia.For_test;

public class test5 {
    //斐波那契数列
    //0,1,1,2,3,5,8,13,21,34,55,89
    static void main(String[] args) {
        //1.定义两个变量,去记录前两项得值
        int a = 0;
        int b = 1;

        //2.定义一个变量记录
        int c = 0;

        //3.利用循环不断获取这特殊数字每一项的值
        //开始条件:3
        //结束条件:10
        //循环体:一 求c的值 二 不断修改记录a和b记录的值
        for (int i = 3;i <= 10;i++){
            c = a + b;
            //不断修改a和b的值
            a = b;
            b = c;
        }
        System.out.println(c);

    }

}
