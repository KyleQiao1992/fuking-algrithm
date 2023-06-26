package com.kaitian.fukingalgrithm.tree.bt.no1457_Pseudo_Palindromic_Paths_in_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int res = 0;
    private int[] count = new int[10];

    public int pseudoPalindromicPaths(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            count[root.val]++;

            int odd = 0;
            for (int n : count) {
                if (n % 2 == 1) {
                    odd++;
                }
            }
            if (odd <= 1) {
                res++;
            }
            count[root.val]--;
            return;
        }

        count[root.val]++;
        traverse(root.left);
        traverse(root.right);
        count[root.val]--;
    }
}
