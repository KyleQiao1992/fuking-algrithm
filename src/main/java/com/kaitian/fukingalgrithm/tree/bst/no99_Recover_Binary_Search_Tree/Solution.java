package com.kaitian.fukingalgrithm.tree.bst.no99_Recover_Binary_Search_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    TreeNode first = null, second = null;

    TreeNode prev = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        inorderTraverse(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraverse(root.left);
        if (root.val < prev.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;
        inorderTraverse(root.right);
    }

    public static void main(String[] args) {
        Integer[] nums = {3, 1, 4, null, null, 2};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.inorderTraverse(node);
    }
}
