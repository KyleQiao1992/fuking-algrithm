package com.kaitian.fukingalgrithm.dp.no_70_Climbing_Stairs;

public class Solution {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        //跳上index层台阶 有dp[index]种跳法
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
