package com.kaitian.fukingalgrithm.tree.bt.no112_Path_Sum;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {

    private int curSum = 0;
    private int target;
    private boolean find = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        this.target = targetSum;
        traverse(root);
        return find;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        curSum += root.val;
        if (root.left == null && root.right == null) {
            if (curSum == target) {
                find = true;
            }
        }
        traverse(root.left);
        traverse(root.right);
        curSum -= root.val;
    }
}
