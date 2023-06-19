package com.kaitian.fukingalgrithm.tree.bt.no671_Second_Minimum_Node_In_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;


public class Solution {

    public int findSecondMinimumValue(TreeNode root) {
        if (root.left == null && root.right == null) {
            return -1;
        }
        int left = root.left.val;
        int right = root.right.val;

        if (root.val == root.left.val) {
            left = findSecondMinimumValue(root.left);
        }
        if (root.val == root.right.val) {
            right = findSecondMinimumValue(root.right);
        }
        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }
        return Math.max(left, right);
    }
}
