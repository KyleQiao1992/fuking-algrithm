package com.kaitian.fukingalgrithm.tree.bt.no226_Invert_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode leftTree = invertTree(root.left);
        TreeNode rightTree = invertTree(root.right);

        root.left = rightTree;
        root.right = leftTree;
        return root;
    }
}
