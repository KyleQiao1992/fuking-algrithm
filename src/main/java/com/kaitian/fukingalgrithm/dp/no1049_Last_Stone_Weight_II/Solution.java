package com.kaitian.fukingalgrithm.dp.no1049_Last_Stone_Weight_II;

public class Solution {

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int s : stones) {
            sum += s;
        }

        int target = sum / 2;

        int[][] dp = new int[stones.length][target + 1];
        for (int j = stones[0]; j <= target; j++) {
            dp[0][j] = stones[0];
        }

        for (int i = 1; i < stones.length; i++) {
            for (int j = 0; j <= target; j++) {
                if (j < stones[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i]] + stones[i]);
                }
            }
        }


        return (sum - dp[stones.length - 1][target]) - dp[stones.length - 1][target];
    }
}
