package com.kaitian.fukingalgrithm.tree.bst.no938_Range_Sum_of_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {

    private int res = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        traverse(root, low, high);
        return res;
    }

    private void traverse(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }

        if (root.val < low) {
            traverse(root.right, low, high);
        } else if (root.val > high) {
            traverse(root.left, low, high);
        } else {
            res += root.val;
            traverse(root.left, low, high);
            traverse(root.right, low, high);
        }
    }
}
