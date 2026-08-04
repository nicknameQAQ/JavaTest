package com.xinjia.shuzu;
//快慢指针
public class test7 {
    static void main(String[] args) {
        //定义快慢指针
        int slow = 0;
        int fast = 1;
        //定义数组
        int [] arr = {1,1,2,2,3,3,3,4,5,};
        //遍历
        while (fast < arr.length){
            if (arr[fast] == arr[slow])
            {
                fast++;
            }else {
                slow++;
                arr[slow] = arr[fast];
                fast++;
            }
        }
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i]);
        }
    }
}
