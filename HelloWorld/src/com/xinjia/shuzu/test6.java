package com.xinjia.shuzu;

import java.util.Random;

//获取10个1-100中的数到数组中,并且要求数唯一
public class test6 {
    public static void main(String[] args) {
        //1.随机数
        Random r = new Random();
        //2.初始化数组
        int [] arr = new int [10];
        //3.循环录入
        for (int i = 0; i < arr.length;) {
            int temp = r.nextInt(100) + 1;
            //检验是否有重复数
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp){
                    count ++;
                    break;
                }
            }
            if(count == 0){
                arr [i] = temp;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
