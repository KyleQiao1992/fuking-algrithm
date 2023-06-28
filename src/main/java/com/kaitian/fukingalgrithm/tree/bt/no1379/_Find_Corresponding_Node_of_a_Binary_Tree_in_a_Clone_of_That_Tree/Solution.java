package com.kaitian.fukingalgrithm.tree.bt.no1379._Find_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private TreeNode res;
    private TreeNode target;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        traverse(original, cloned);
        return res;
    }

    private void traverse(TreeNode original, TreeNode cloned) {
        if (original == null || res != null) {
            return;
        }
        if (original == target) {
            res = cloned;
            return;
        }

        traverse(original.left, cloned.left);
        traverse(original.right, cloned.right);
    }
}
