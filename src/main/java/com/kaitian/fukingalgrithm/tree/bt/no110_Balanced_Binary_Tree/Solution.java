package com.kaitian.fukingalgrithm.tree.bt.no110_Balanced_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        getMaxDepth(root);
        return isBalanced;
    }


    private int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftTreeDepth = getMaxDepth(root.left);
        int rightTreeDepth = getMaxDepth(root.right);

        if (Math.abs(rightTreeDepth - leftTreeDepth) > 1) {
            isBalanced = false;
        }
        return 1 + Math.max(leftTreeDepth, rightTreeDepth);
    }
}
