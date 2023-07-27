package com.kaitian.fukingalgrithm.array.no724_Find_Pivot_Index;

public class Solution {

    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] preSum = new int[len + 1];

        for (int i = 1; i <= len; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }

        for (int i = 1; i < preSum.length; i++) {
            int leftSum = preSum[i - 1] - preSum[0];
            int rightSum = preSum[len] - preSum[i];

            if (leftSum == rightSum) {
                return i - 1;
            }
        }
        return -1;
    }
}
