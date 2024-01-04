package com.kaitian.fukingalgrithm.array._window.no209_Minimum_Size_Subarray_Sum;

public class Solution3 {

    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = -1;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        while (l < nums.length) {
            if (r + 1 < nums.length && sum < s) {
                r++;
                sum += nums[r];
            } else {
                sum -= nums[l];
                l++;
            }

            if (sum >= s) {
                res = Math.min(res, r - l + 1);
            }

        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
