package com.kaitian.fukingalgrithm.demo;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.*;

public class Test {
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

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, null, 4, 5, 6};
        TreeNode node = TreeNode.constructTree(nums);
        Test f = new Test();
        f.findNearestRightNode(node, new TreeNode(4));
    }
}
