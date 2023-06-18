package com.kaitian.fukingalgrithm.tree.bst.no270_Closest_Binary_Search_Tree_Value;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public int closestValue(TreeNode root, double target) {
        if (root.val == target) {
            return root.val;
        }

        int result = 0;
        if (target < root.val) {
            if (root.left == null) {
                return root.val;
            }

            int leftValue = closestValue(root.left, target);
            return diff(root.val, target) < diff(leftValue, target) ? root.val : leftValue;
        } else {
            if (root.right == null) {
                return root.val;
            }

            int rightValue = closestValue(root.right, target);
            return diff(rightValue, target) < diff(root.val, target) ? rightValue : root.val;
        }
    }

    private double diff(int i, double target) {
        return Math.abs(i - target);
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        Integer[] nums = {1, null, 2};
        TreeNode node = TreeNode.constructTree(nums);
        f.closestValue(node, 3.428571f);
    }
}
