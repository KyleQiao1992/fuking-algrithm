package com.kaitian.fukingalgrithm.tree.bt.no543_Diameter_of_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * <p>
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 * <p>
 * The length of a path between two nodes is represented by the number of edges between them.
 */
public class Solution {

    private int d = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return d;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        d = Math.max(d, leftMaxDepth + rightMaxDepth);

        traverse(root.left);
        traverse(root.right);
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
