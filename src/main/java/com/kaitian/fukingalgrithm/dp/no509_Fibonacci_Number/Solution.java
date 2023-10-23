package com.kaitian.fukingalgrithm.dp.no509_Fibonacci_Number;

public class Solution {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        //表示：index所对应的fib = memo[index]
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i < memo.length; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}
