package com.kaitian.fukingalgrithm.tree.bt.no563_Binary_Tree_Tilt;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int res = 0;

    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }

        sum(root);
        return res;
    }

    // 定义：输入一棵二叉树，返回这棵二叉树所有元素的和
    private int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        res += Math.abs(leftSum - rightSum);

        return leftSum + rightSum + root.val;
    }
}
