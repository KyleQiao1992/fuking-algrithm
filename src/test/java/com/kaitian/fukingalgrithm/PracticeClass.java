package com.kaitian.fukingalgrithm;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.List;
import java.util.Map;

public class PracticeClass {

    public boolean isBalanced(TreeNode root) {
        getMaxDepth(root);
        return isBalanced;
    }

    private boolean isBalanced = true;

    private int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMaxDepth = getMaxDepth(root.left);
        int rightMaxDepth = getMaxDepth(root.right);

        if (Math.abs(leftMaxDepth - rightMaxDepth) > 1) {
            isBalanced = false;
        }
        return 1 + Math.max(leftMaxDepth, rightMaxDepth);
    }
}
