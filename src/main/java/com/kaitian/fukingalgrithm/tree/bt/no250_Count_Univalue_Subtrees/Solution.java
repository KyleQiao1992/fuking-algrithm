package com.kaitian.fukingalgrithm.tree.bt.no250_Count_Univalue_Subtrees;

import com.kaitian.fukingalgrithm.tree.TreeNode;


public class Solution {

    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getUniValue(root);
        return res;
    }

    private int res = 0;

    // 定义：输入一棵二叉树，如果这棵二叉树的所有节点值都相同，则返回它们的值，
    // 如果这棵二叉树的所有节点的值不是相同的，则返回 -1001。
    //（因为题目说节点的正常取值为 [-1000, 1000]，所以 -1001 是个特殊值）
    private int getUniValue(TreeNode root) {
        int left = root.left == null ? root.val : getUniValue(root.left);
        int right = root.right == null ? root.val : getUniValue(root.right);

        // 如果有任何一棵子树的值不相同，那么以 root 为根的这棵树的值肯定不可能全部相同
        if (left == -1001 || right == -1001) {
            return -1001;
        }

        // 如果左右子树的值都相同，且等于 root.val，
        // 则说明以 root 为根的二叉树是一棵所有节点都相同的二叉树
        if (left == right && root.val == left) {
            // 给全局变量 res 加一
            res++;
            return root.val;
        }
        // 否则，以 root 为根的二叉树不是一棵所有节点都相同的二叉树
        return -1001;
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 1, 5, 5, 5, null, 5};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.countUnivalSubtrees(node);
    }
}