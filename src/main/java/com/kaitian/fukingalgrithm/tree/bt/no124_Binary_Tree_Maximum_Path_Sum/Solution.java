package com.kaitian.fukingalgrithm.tree.bt.no124_Binary_Tree_Maximum_Path_Sum;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        oneSideMax(root);
        return res;
    }

    //定义：计算从根节点root为起点的最大单边路径之和
    private int oneSideMax(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMaxSum = Math.max(0, oneSideMax(root.left));
        int rightMaxSum = Math.max(0, oneSideMax(root.right));

        int pathMaxSum = leftMaxSum + rightMaxSum + root.val;
        res = Math.max(res, pathMaxSum);

        return Math.max(leftMaxSum, rightMaxSum) + root.val;
    }
}
