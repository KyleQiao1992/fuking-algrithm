package com.kaitian.fukingalgrithm.dp.no96_Unique_Binary_Search_Trees;

public class Solution {

    public int numTrees(int n) {

        //index对应有dp[index]种不同的二叉树
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //一共i个节点，对于根节点j时,左子树的节点个数为j-1，右子树的节点个数为i-j
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
