package com.xinjia.LeetCode;

class t88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // nums1 有效数字最后一位
        int j = n - 1; // nums2 最后一位
        int k = m + n - 1; // 合并后总长度最后一位

        // 从后往前遍历
        while (i >= 0 && j >= 0) {
            // 谁大谁放后面
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // 如果 nums2 还有剩下的，全部拷贝到 nums1 前面
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}