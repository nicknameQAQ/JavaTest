package com.xinjia.fangfa;

import java.util.Random;

public class test2 {
    //1-100随机数生成优化版
    static void main(String[] args) {
        //1.随机数生成
        Random r = new Random();
        int num;
        int[] arr = new int[10];
        //2.循环遍历查找重复数字
        for (int i = 0; i < arr.length;) {
            num = r.nextInt(100) + 1;
            boolean flag = contains(num,arr);
            if (!flag){
                arr[i] = num;
                i++;

            }
            }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "   ");
        }
    }
    //定义一个方法判断数组中是否存在重复数组
    public static boolean contains(int num,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
