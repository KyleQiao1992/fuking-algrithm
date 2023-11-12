package com.kaitian.fukingalgrithm.dp.no343_Integer_Break;

public class Solution {

    // 输入n 输出是n的乘积最大值
    public int integerBreak(int n) {
        //index所对应的最大乘积是dp[index]
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i - j; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

}
