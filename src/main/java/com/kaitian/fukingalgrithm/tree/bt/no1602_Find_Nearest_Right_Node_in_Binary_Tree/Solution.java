package com.kaitian.fukingalgrithm.tree.bt.no1602_Find_Nearest_Right_Node_in_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {
    private TreeNode res = null;
    private int targetDepth = -1;

    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        traverse(root, 0, u.val);
        return res;
    }

    private void traverse(TreeNode root, int depth, int targetVal) {
        if (root == null || res != null) {
            return;
        }

        if (root.val == targetVal) {
            targetDepth = depth;
        } else if (depth == targetDepth) {
            res = root;
            return;
        }

        traverse(root.left, depth + 1, targetVal);
        traverse(root.right, depth + 1, targetVal);
    }
}
