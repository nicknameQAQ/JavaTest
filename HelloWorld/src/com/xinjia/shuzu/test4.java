package com.xinjia.shuzu;
//找出数组中的最大值打印出来
public class test4 {
    static void main(String[] args) {
        //1.初始化一个数组
        int [] arr = {33,231,42,14,414,23,11,34,23};
        //2.定义一个变量储存最大数
        /*int max = 0; 不能定义为0,如果数组中全为负数就不对了*/
        int max = arr[0];
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组中最大值为" + max);


    }
}
