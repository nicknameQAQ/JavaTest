package com.xinjia.shuzu;

//打乱数组中的数
import java.util.Random;

public class test5 {
    static void main(String[] args) {
        //1.定义数组
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        Random r = new Random();
        //2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            int temp;
            int randomIndex = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
