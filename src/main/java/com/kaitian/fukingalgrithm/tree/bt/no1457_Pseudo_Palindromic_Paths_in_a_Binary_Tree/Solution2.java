package com.kaitian.fukingalgrithm.tree.bt.no1457_Pseudo_Palindromic_Paths_in_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {

    public int pseudoPalindromicPaths(TreeNode root) {
        traverse(root);
        return res;
    }

    int count = 0;
    int res = 0;

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            count = count ^ (1 << root.val);

            if ((count & count - 1) == 0) {
                res++;
            }

            count = count ^ (1 << root.val);
            return;
        }

        count = count ^ (1 << root.val);

        traverse(root.left);
        traverse(root.right);

        count = count ^ (1 << root.val);
    }
}
