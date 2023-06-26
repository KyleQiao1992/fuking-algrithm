package com.kaitian.fukingalgrithm.bit.no268_Missing_Number;

//丢失的数字
//给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。

public class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0;

        res ^= n;

        for (int i = 0; i < n; i++) {
            res ^= i ^ nums[i];
        }

        return res;
    }
}
