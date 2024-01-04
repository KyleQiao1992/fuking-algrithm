package com.kaitian.fukingalgrithm.array._window.no209_Minimum_Size_Subarray_Sum;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int res = Integer.MAX_VALUE;
        int subLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i ; j < nums.length; j++) {
                sum += nums[j];

                if (sum >= target) {
                    subLength = j - i + 1;
                    res = Math.min(res, subLength);
                    break;
                }
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.minSubArrayLen(4, new int[]{1, 4, 4});
    }
}
