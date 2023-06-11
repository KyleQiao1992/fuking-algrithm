package com.kaitian.fukingalgrithm.tree.bt.no543_Diameter_of_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {
    private int d = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return d;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftD = maxDepth(root.left);
        int rightD = maxDepth(root.right);
        d = Math.max(d, leftD + rightD);

        return 1 + Math.max(leftD, rightD);
    }
}
