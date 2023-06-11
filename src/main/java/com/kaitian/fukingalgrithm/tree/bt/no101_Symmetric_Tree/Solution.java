package com.kaitian.fukingalgrithm.tree.bt.no101_Symmetric_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return Boolean.TRUE;
        }
        return traverse(root.left, root.right);
    }

    private Boolean traverse(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return Boolean.TRUE;
        }
        if (node1 == null || node2 == null) {
            return Boolean.FALSE;
        }

        if (node1.val != node2.val) {
            return Boolean.FALSE;
        }
        return traverse(node1.left, node2.right) && traverse(node1.right, node2.left);
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 2, 3, 4, 4, 3};
        TreeNode node = TreeNode.constructTree(array);
        Solution f = new Solution();
        f.isSymmetric(node);
    }
}
