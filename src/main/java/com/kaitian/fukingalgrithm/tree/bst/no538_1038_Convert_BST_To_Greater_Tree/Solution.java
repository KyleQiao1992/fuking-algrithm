package com.kaitian.fukingalgrithm.tree.bst.no538_1038_Convert_BST_To_Greater_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private Integer sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        traverse(root);
        return root;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }

        traverse(node.right);

        sum += node.val;
        node.val = sum;

        traverse(node.left);
    }
}
