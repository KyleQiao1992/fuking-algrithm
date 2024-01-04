package com.kaitian.fukingalgrithm.array._window.no209_Minimum_Size_Subarray_Sum;

public class Solution2 {

    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int subLength = 0;
        int sum = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            while (sum >= target) {
                subLength = j - i + 1;
                res = Math.min(res, subLength);
                sum -= nums[i];
                i++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        Solution2 f = new Solution2();
        f.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
    }
}
