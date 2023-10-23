package com.kaitian.fukingalgrithm.dp.no322_Coin_Change;

import java.util.Arrays;
import java.util.Map;

public class Solution3 {

    //当目标金额为 i 时，至少需要 dp[i] 枚硬币凑出。
    public int coinChange(int[] coins, int amount) {
        //要凑出 index=amount 需要dp[index] = value枚硬币
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        //这里的i就是目标金额
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Solution3 solution3=new Solution3();
        solution3.coinChange(new int[]{2},3);
    }
}
