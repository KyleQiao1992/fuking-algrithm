package com.kaitian.fukingalgrithm.tree.bst.no230_Kth_Smallest_Element_in_a_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return res;
        }
        traverse(root, k);
        return res;
    }

    private Integer rank = 0;
    private Integer res = 0;

    private void traverse(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        traverse(node.left, k);
        rank++;
        if (rank == k) {
            res = node.val;
            return;
        }
        traverse(node.right, k);
    }
}
