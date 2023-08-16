package com.kaitian.fukingalgrithm.tree.bst.no530_Minimum_Absolute_Difference_in_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public int getMinimumDifference(TreeNode root) {
        this.preNode = root;
        traverse(root);
        return res;
    }

    private int res = Integer.MAX_VALUE;
    TreeNode preNode = null;

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        if (root.val != preNode.val) {
            res = Math.min(res, Math.abs(root.val - preNode.val));
        }
        preNode = root;
        traverse(root.right);
    }

    public static void main(String[] args) {
        Integer[] nums = {236, 104, 701, null, 227, null, 911};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.getMinimumDifference(node);
    }
}
