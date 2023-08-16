package com.kaitian.fukingalgrithm.tree.bt.no513_Find_Bottom_Left_Tree_Value;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public int findBottomLeftValue(TreeNode root) {
        traverse(root);
        return res;
    }

    private int res = Integer.MIN_VALUE;
    private int depth = 0;
    private int curDepth = 0;

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        depth++;

        if (depth >= curDepth) {
            curDepth = depth;
            res = root.val;
        }

        traverse(root.right);
        traverse(root.left);
        depth--;
    }
}
