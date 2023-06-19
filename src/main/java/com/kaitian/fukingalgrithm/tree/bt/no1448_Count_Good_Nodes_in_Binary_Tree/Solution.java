package com.kaitian.fukingalgrithm.tree.bt.no1448_Count_Good_Nodes_in_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int res = 0;

    public int goodNodes(TreeNode root) {
        traverse(root, root.val);
        return res;
    }

    private void traverse(TreeNode root, int pathMax) {
        if (root == null) {
            return;
        }
        if (pathMax <= root.val) {
            res++;
        }

        pathMax = Math.max(pathMax, root.val);
        traverse(root.left, pathMax);
        traverse(root.right, pathMax);
    }
}
