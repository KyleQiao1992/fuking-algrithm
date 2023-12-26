package com.kaitian.fukingalgrithm.array.double_point.no977_Squares_of_a_Sorted_Array;

public class Solution {

    public int[] sortedSquares(int[] nums) {

        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int p = res.length - 1;

        while (p >= 0) {
            int leftNum = nums[left] * nums[left];
            int rightNum = nums[right] * nums[right];
            if (leftNum > rightNum) {
                res[p] = leftNum;
                left++;
            } else {
                res[p] = rightNum;
                right--;
            }
            p--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums = {-4, -1, 0, 3, 10};
        f.sortedSquares(nums);
    }
}
