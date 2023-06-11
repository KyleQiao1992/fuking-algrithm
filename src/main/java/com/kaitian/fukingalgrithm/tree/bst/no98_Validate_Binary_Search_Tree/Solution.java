package com.kaitian.fukingalgrithm.tree.bst.no98_Validate_Binary_Search_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public boolean isValidBST(TreeNode root) {
        return traverse(root, null, null);
    }

    public boolean traverse(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.val <= min.val) {
            return false;
        }

        if (max != null && root.val >= max.val) {
            return false;
        }

        return traverse(root.left, min, root) && traverse(root.right, root, max);
    }
}
