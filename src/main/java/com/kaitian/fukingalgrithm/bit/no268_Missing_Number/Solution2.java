package com.kaitian.fukingalgrithm.bit.no268_Missing_Number;

public class Solution2 {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        long expect = (long) (n) * (n + 1) / 2;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (int) (expect - sum);
    }
}
