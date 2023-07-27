package com.kaitian.fukingalgrithm.array.no303_Range_Sum_Query_Immutable;

public class NumArray2 {
    private int[] pre;

    public NumArray2(int[] nums) {
        pre = new int[nums.length + 1];

        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return pre[right + 1] - pre[left];
    }
}
