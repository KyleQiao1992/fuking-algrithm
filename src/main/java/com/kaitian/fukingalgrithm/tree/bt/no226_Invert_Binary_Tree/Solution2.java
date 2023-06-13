package com.kaitian.fukingalgrithm.tree.bt.no226_Invert_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {

    public TreeNode invertTree(TreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;

        traverse(root.left);
        traverse(root.right);
    }
}

