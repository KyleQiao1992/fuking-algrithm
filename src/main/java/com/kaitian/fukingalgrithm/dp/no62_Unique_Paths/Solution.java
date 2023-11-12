package com.kaitian.fukingalgrithm.dp.no62_Unique_Paths;

import java.util.Arrays;

public class Solution {

    public int uniquePaths(int m, int n) {
        //从（0，0）出发 到i,j 有 dp[i][j]条不同的路径
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];

    }
}
