package com.xinjia.suanfaxunlian;

public class zhongweishu {
    public static void main(String[] args) {
        // 测试用例1
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        double median1 = findMedianSortedArrays(arr1, arr2);
        System.out.println("测试用例1的中位数: " + median1);
        
        // 测试用例2
        int[] arr3 = {1, 2};
        int[] arr4 = {3, 4};
        double median2 = findMedianSortedArrays(arr3, arr4);
        System.out.println("测试用例2的中位数: " + median2);
        
        // 测试用例3
        int[] arr5 = {0, 0};
        int[] arr6 = {0, 0};
        double median3 = findMedianSortedArrays(arr5, arr6);
        System.out.println("测试用例3的中位数: " + median3);
    }
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 合并两个有序数组
        int[] merged = mergeSortedArrays(nums1, nums2);
        
        // 计算中位数
        int length = merged.length;
        if (length % 2 == 1) {
            // 奇数长度，返回中间元素
            return merged[length / 2];
        } else {
            // 偶数长度，返回中间两个元素的平均值
            int mid1 = merged[length / 2 - 1];
            int mid2 = merged[length / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
    
    private static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        
        // 双指针法合并两个有序数组
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        // 处理剩余元素
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        
        return merged;
    }
}