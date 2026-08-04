package com.xinjia.shuzu;

import java.util.Random;

//获取10个1-100中的数到数组中,并且要求数唯一
public class test6_2 {
    public static void main(String[] args) {
        //1.随机数
        Random r = new Random();
        //2.初始化数组
        int[] arr = new int[10];
        //3.循环录入
        for (int i = 0; i < arr.length; i++) {
            int temp;
            boolean isDuplicate;
            do {
                temp = r.nextInt(100) + 1;
                isDuplicate = false;
                for (int j = 0; j < i; j++) { // 只检查已填充的位置
                    if (arr[j] == temp) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
