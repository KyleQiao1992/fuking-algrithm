package com.kaitian.fukingalgrithm.tree.bst.no285_Inorder_Successor_in_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }

        TreeNode successor = null;
        if (root.val > p.val) {
            successor = inorderSuccessor(root.left, p);
            if (successor == null) {
                successor = root;
            }
        }

        if (root.val < p.val) {
            successor = inorderSuccessor(root.right, p);
        }

        if (root.val == p.val) {
            successor = getMinNode(root.right);
        }

        return successor;

    }

    private TreeNode getMinNode(TreeNode p) {
        while (p != null && p.left != null) {
            p = p.left;
        }
        return p;
    }
}
