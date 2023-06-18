package com.kaitian.fukingalgrithm.tree.bt.no617_Merge_Two_Binary_Trees;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {


    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        root1.val += root2.val;

        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
}
