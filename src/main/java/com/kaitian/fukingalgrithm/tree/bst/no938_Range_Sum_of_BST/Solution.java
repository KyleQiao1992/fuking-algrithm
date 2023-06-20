package com.kaitian.fukingalgrithm.tree.bst.no938_Range_Sum_of_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;
import lombok.val;

public class Solution {

    private int low;
    private int high;
    private int res = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;

        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }


        if (root.val >= low && root.val <= high) {
            res += root.val;
        }

        traverse(root.left);
        traverse(root.right);
    }
}
