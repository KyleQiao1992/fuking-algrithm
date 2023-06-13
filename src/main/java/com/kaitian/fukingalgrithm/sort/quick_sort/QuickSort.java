package com.kaitian.fukingalgrithm.sort.quick_sort;

import java.util.Random;

public class QuickSort {
    public static void sort(int[] nums) {
        // 排序整个数组（原地修改）
        sort(nums, 0, nums.length - 1);
    }

    private static void sort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        // 对 nums[lo..hi] 进行切分
        // 使得 nums[lo..p-1] <= nums[p] < nums[p+1..hi]
        int p = partition(nums, lo, hi);

        sort(nums, lo, p - 1);
        sort(nums, p + 1, hi);
    }

    private static int partition(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int j = lo;
        for (int i = lo + 1; i <= hi; i++) {
            if (nums[i] < v) {
                j++;
                swap(nums, j, i);
            }
            swap(nums, lo, j);
        }
        return j;
    }

    // 原地交换数组中的两个元素
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
