package edu.hue.toolclasstest;

public class Test {
    public static void main(String[] args) {
        int[] arr = {523,341,42,414,53,77};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);
        int[] arr2 = {1,2,3,4,7};
        //ctrl + alt + v自动生成接收变量
        double avg = ArrayUtil.getavg(arr2);
        System.out.println(avg);
    }

}
