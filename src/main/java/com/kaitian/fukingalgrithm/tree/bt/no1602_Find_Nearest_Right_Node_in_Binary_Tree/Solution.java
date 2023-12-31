package com.kaitian.fukingalgrithm.tree.bt.no1602_Find_Nearest_Right_Node_in_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        traverse(root, 0, u.val);
        return res;
    }

    int targetDepth = -1;
    TreeNode res = null;

    // 二叉树遍历函数
    void traverse(TreeNode root, int depth, int targetVal) {
        if (root == null || res != null) {
            return;
        }
        if (targetVal == root.val) {
            // 找到目标层数
            targetDepth = depth;
            return;
        }

        if (depth == targetDepth) {
            // 找到下一个当前层数的节点
            res = root;
            return;
        }

        // 二叉树遍历框架
        traverse(root.left, depth + 1, targetVal);
        traverse(root.right, depth + 1, targetVal);
    }
}
