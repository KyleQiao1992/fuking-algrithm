package com.kaitian.fukingalgrithm.tree.construct.no998_Maximum_Binary_Tree_II;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val < val) {

            TreeNode temp = root;
            root = new TreeNode(val);
            root.left = temp;

        } else {
            root.right = insertIntoMaxTree(root.right, val);
        }

        return root;
    }
}
