package com.kaitian.fukingalgrithm.dp.no746_Min_Cost_Climbing_Stairs;

public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        if (length < 2) {
            return 0;
        }
        //第index 阶台阶对应的最小花费是 dp[index];
        int[] dp = new int[length + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[length];
    }
}
