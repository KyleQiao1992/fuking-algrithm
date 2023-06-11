package com.kaitian.fukingalgrithm.tree.bt.no654_Maximum_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null) {
            return null;
        }
        return build(nums, 0, nums.length - 1);

    }

    public TreeNode build(int[] nums, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return null;
        }
        Integer maxIdx = getMaxNumIdx(nums, startIdx, endIdx);

        TreeNode root = new TreeNode(nums[maxIdx]);
        root.left = build(nums, startIdx, maxIdx - 1);
        root.right = build(nums, maxIdx + 1, endIdx);

        return root;
    }

    private Integer getMaxNumIdx(int[] nums, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return -1;
        }

        int resIdx = -1;
        int numCnt = Integer.MIN_VALUE;
        for (int i = startIdx; i <= endIdx; i++) {
            if (nums[i] > numCnt) {
                numCnt = nums[i];
                resIdx = i;
            }
        }
        return resIdx;
    }
}
