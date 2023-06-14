package com.kaitian.fukingalgrithm.tree.bt.no404_Sum_of_Left_Leaves;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int res = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null &&
                root.left.left == null &&
                root.left.right == null) {
            res += root.left.val;
        }
        traverse(root.left);
        traverse(root.right);
    }
}
