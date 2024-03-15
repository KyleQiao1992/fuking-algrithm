package com.kaitian.fukingalgrithm.dp.no416_Partition_Equal_Subset_Sum;

public class Solution {

    public boolean canPartition(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 == 1) {
            return false;
        }

        int target = sum / 2;
        int[][] dp = new int[nums.length][target + 1];

        for (int j = nums[0]; j <= target; j++) {
            dp[0][j] = nums[0];
        }

        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= target; j++) {
                if (j < nums[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                }
            }
        }
        return dp[len - 1][target] == target;
    }
}
