package com.xinjia.fangfa;

public class test3 {
    //定义方法遍历数组
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    static void main(String[] args) {
        int[] a = {1,3,41,2,41,52,14,532,52};
        printArr(a);
    }

}
