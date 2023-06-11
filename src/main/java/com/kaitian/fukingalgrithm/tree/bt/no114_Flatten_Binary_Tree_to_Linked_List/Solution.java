package com.kaitian.fukingalgrithm.tree.bt.no114_Flatten_Binary_Tree_to_Linked_List;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode leftTree = root.left;
        TreeNode rightTree = root.right;

        root.left = null;
        root.right = leftTree;

        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = rightTree;
    }
}
