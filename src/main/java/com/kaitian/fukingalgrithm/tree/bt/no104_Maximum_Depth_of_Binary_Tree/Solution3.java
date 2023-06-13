package com.kaitian.fukingalgrithm.tree.bt.no104_Maximum_Depth_of_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution3 {
    private int res = 0;
    public int deep = 0;


    public int maxDepth(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        deep++;
        if (root.left == null && root.right == null) {
            res = Math.max(res, deep);
        }
        traverse(root.left);
        traverse(root.right);
        deep--;
    }
}
