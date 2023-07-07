package com.kaitian.fukingalgrithm.tree.bst.no814_Binary_Tree_Pruning;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {


    //输入一颗二叉树，返回的二叉树叶子节点都是1
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }

        return root;
    }
}
