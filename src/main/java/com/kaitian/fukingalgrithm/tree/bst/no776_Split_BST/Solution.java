package com.kaitian.fukingalgrithm.tree.bst.no776_Split_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    //定义： 输入一棵BST和一个target, 返回两棵BST的根节点
    //第一棵树所有节点都小于等于target,第二棵树都大于target
    public TreeNode[] splitBST(TreeNode root, int target) {
        if (root == null) {
            return new TreeNode[2];
        }

        TreeNode[] res = new TreeNode[2];

        if (root.val <= target) {
            res[0] = root;
            TreeNode[] right = splitBST(root.right, target);
            res[1] = right[1];
            root.right = right[0];
        } else {
            res[1] = root;
            TreeNode[] left = splitBST(root.left, target);
            res[0] = left[0];

            root.left = left[1];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        Integer[] nums = {4, 2, 6, 1, 3, 5, 7};
        TreeNode root = TreeNode.constructTree(nums);
        f.splitBST(root, 2);
    }
}
