package com.kaitian.fukingalgrithm.tree.bst.no938_Range_Sum_of_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution3 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        } else if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        } else {
            return root.val +
                    rangeSumBST(root.left, low, high) +
                    rangeSumBST(root.right, low, high);
        }
    }
}
