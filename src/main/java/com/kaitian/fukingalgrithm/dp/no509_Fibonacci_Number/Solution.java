package com.kaitian.fukingalgrithm.dp.no509_Fibonacci_Number;

public class Solution {

    public int fib(int n) {
        int[] memo = new int[n + 1];
        return dp(memo, n);
    }

    private int dp(int[] memo, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = dp(memo, n - 1) + dp(memo, n - 2);
        return memo[n];
    }
}
