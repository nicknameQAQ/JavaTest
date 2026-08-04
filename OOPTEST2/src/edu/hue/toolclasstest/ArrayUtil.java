package edu.hue.toolclasstest;

public class ArrayUtil {
    //私有化构造方法,防止创建对象
    private ArrayUtil(){

    }
    /*提供一个方法printArr,用于打印数组
    只考虑整数数组
    */
    public static String printArr(int[] arr){
        /*System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }*/
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = result + arr[i] + "]";
            } else {
                result = result + arr[i] + ",";
            }
        }
        return result;
    }
    /*
    * 定义一个方法用于返回平均分
    *
    * */
    public static double getavg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum * 1.0 / arr.length;
    }
}
