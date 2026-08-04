package com.xinjia.fangfa;
import java.lang.classfile.instruction.ReturnInstruction;
import java.util.Scanner;
public class test5 {
    //评委打分
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        int num;//定义一个数临时储存
        int[] arr = new int[5];//定义一个数组
        for (int i = 0; i < 5; ) {
            num = sc.nextInt();
            if (0 <= num && num <= 100){
                System.out.println("录入成功");
                arr[i] = num;
                i++;
            }else {
                System.out.println("请重新输入,数字要求在0-100之间");
                continue;
            }

        }
        int max = maxNum(arr);
        int min = minNum(arr);
        int sum = sumNum(arr);
        int aver = sum - max - min;
        System.out.println("数组最大值为" + max);
        System.out.println("数组最小值为" + min);
        System.out.println("五位评委的总分为" + sum);
        System.out.println("平均分为" + aver);
    }
    //求最大值
    public static int maxNum(int arr[]){
        int temp = arr[0];//临时变量
        for (int i = 1; i < arr.length; i++) {
            if(temp < arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
    //求最小值
    public static int minNum(int arr[]) {
        int temp = arr[0];//临时变量
        for (int i = 1; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }
    //求总分
    public static int sumNum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
    return sum;
    }


}
