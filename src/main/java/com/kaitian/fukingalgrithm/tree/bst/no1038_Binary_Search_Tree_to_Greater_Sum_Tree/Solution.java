package com.kaitian.fukingalgrithm.tree.bst.no1038_Binary_Search_Tree_to_Greater_Sum_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }
}
