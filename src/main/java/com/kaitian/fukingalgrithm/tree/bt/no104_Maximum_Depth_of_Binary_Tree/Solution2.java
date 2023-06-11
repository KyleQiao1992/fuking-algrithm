package com.kaitian.fukingalgrithm.tree.bt.no104_Maximum_Depth_of_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
