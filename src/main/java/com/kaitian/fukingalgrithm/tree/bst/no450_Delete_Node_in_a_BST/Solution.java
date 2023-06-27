package com.kaitian.fukingalgrithm.tree.bst.no450_Delete_Node_in_a_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode leftMax = maxNode(root.left);
                root.left = removeMax(root.left);

                leftMax.left = root.left;
                leftMax.right = root.right;
                root = leftMax;
            }
        }
        return root;
    }

    private TreeNode maxNode(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    private TreeNode removeMax(TreeNode root) {
        if (root.right == null) {
            return root.left;
        }

        root.right = removeMax(root.right);
        return root;
    }
}
