package com.kaitian.fukingalgrithm.tree.construct.no654_Maximum_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int index = -1, maxVal = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (maxVal < nums[i]) {
                index = i;
                maxVal = nums[i];
            }
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = build(nums, start, index - 1);
        root.right = build(nums, index + 1, end);
        return root;
    }
}
