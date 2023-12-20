package com.kaitian.fukingalgrithm.array.no35_Search_Insert_Position;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return right + 1;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums = {1, 3, 5, 6};
        f.searchInsert(nums, 2);
    }
}
