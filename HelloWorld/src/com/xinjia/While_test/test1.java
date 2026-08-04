package com.xinjia.While_test;

public class test1 {
    //折纸
    static void main(String[] args) {
        //1.定义变量表示纸张厚度
        double paper = 0.1;

        //2.定义山的高度
        double height = 8848860;

        //3.定义次数
        int time = 0;
        //利用循环折叠纸张
        while (paper < height){
            paper *= 2;
            time ++;
        }
        System.out.println(time);

    }
}
