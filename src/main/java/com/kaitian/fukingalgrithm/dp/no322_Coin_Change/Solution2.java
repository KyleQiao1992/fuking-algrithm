package com.kaitian.fukingalgrithm.dp.no322_Coin_Change;

import java.util.Arrays;

//
public class Solution2 {

    private int[] memo;

    //coins 中是可选硬币的面值，amount是目标
    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, -666);
        return dp(coins, amount);
    }

    // 要凑出金额为n,至少需要dp(coins.n)个硬币
    private int dp(int[] coins, int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }

        if (memo[n] != -666) {
            return memo[n];
        }

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = dp(coins, n - coin);
            if (subProblem == -1) {
                continue;
            }
            res = Math.min(res, 1 + subProblem);
        }
        res = res == Integer.MAX_VALUE ? -1 : res;
        memo[n] = res;
        return res;
    }

}
