package com.kaitian.fukingalgrithm.dp.no300_Longest_Increasing_Subsequence;

import java.util.Arrays;
import java.util.Map;

public class Solution {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return Arrays.stream(dp).max().orElse(1);
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.lengthOfLIS(new int[]{1, 4, 2, 4, 2, 3});
    }
}
