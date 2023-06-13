package com.kaitian.fukingalgrithm.tree.bst.no95_Unique_Binary_Search_Trees_II;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<>();
        }
        return buildTree(1, n);
    }

    private List<TreeNode> buildTree(int low, int high) {
        List<TreeNode> res = new LinkedList<>();

        if (low > high) {
            res.add(null);
            return res;
        }

        //1.穷举所有root的可能
        for (int i = low; i <= high; i++) {
            //2.递归构造左右子树
            List<TreeNode> leftTree = buildTree(low, i - 1);
            List<TreeNode> rightTree = buildTree(i + 1, high);

            //3给root节点穷举所有左右子树的组合
            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
