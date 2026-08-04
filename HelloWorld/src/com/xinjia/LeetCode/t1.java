package com.xinjia.LeetCode;

class t1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // j 从 i+1 开始，避免同一个元素用两次
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];

    }

    static void main(String[] args) {
        int [] r1 = twoSum(new int[] {2,7,11,15},9);
        int [] r2 = twoSum(new int[] {3,2,4},6);
        int [] r3 = twoSum(new int[] {3,3},6);
        System.out.println("[" + r1[0] + "," + r1[1] + "]");
        System.out.println("[" + r2[0] + "," + r2[1] + "]");
        System.out.println("[" + r3[0] + "," + r3[1] + "]");

    }
}