package com.kaitian.fukingalgrithm.tree.bst.no897_Increasing_Order_Search_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = increasingBST(root.left);
        root.left = null;
        TreeNode right = increasingBST(root.right);
        root.right = right;

        if (left == null) {
            return root;
        }

        TreeNode p = left;
        while (p.right != null) {
            p = p.right;
        }
        p.right = root;

        return left;
    }


    public static void main(String[] args) {
        Solution f = new Solution();
        Integer[] nums = {5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9};
        TreeNode root = TreeNode.constructTree(nums);
        f.increasingBST(root);
    }
}
