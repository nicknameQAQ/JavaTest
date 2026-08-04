package com.xinjia.suanfaxunlian;

public class yichu {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,4,4,5,5};
        int val = 4;
        int fast = 0;
        int slow = 0;
        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        for (int i = 0; i < slow; i++) {
            System.out.print(nums[i] + "   ");
        }

    }
}
