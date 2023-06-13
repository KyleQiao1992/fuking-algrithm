package com.kaitian.fukingalgrithm.sort.merge_sort.no492_reverse_pairs;

public class Solution {

    private int[] temp;
    private int count = 0;

    public int reversePairs(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return count;
    }

    private void sort(int[] nums, int low, int high) {
        if (low == high) {
            return;
        }

        int mid = low + (high - low) / 2;
        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    private void merge(int[] nums, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = nums[i];
        }

        for (int i = low; i <= mid; i++) {
            for (int j = mid + 1; j <= high; j++) {
                if ((long) nums[i] > (long) nums[j] * 2) {
                    count++;
                }
            }
        }

        int i = low;
        int j = mid + 1;
        for (int p = low; p <= high; p++) {
            if (i == mid) {
                nums[p] = temp[j++];
            } else if (j == high + 1) {
                nums[p] = temp[i++];
            } else if (temp[i] < temp[j]) {
                nums[p] = temp[i++];
            } else {
                nums[p] = temp[j++];
            }
        }
    }
}
