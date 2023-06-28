package com.kaitian.fukingalgrithm.tree.bt.j26_isSubTree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {


    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }

        if (A.val == B.val&&compareTree(A, B)){
            return true;
        }

        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean compareTree(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }

        if (A == null) {
            return false;
        }
        if (A.val != B.val) {
            return false;
        }
        return compareTree(A.left, B.left) && compareTree(A.right, B.right);
    }
}
