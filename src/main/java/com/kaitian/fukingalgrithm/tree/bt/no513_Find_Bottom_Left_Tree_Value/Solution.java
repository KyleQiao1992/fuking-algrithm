package com.kaitian.fukingalgrithm.tree.bt.no513_Find_Bottom_Left_Tree_Value;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int depth = 0;
    private int maxDepth = 0;
    private TreeNode res = null;

    public int findBottomLeftValue(TreeNode root) {
        traverse(root);
        return res.val;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        depth++;
        if (depth > maxDepth) {
            maxDepth = depth;
            res = root;
        }
        traverse(root.left);
        traverse(root.right);
        depth--;
    }
}
