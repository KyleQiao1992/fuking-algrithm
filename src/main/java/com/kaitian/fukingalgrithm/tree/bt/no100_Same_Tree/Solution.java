package com.kaitian.fukingalgrithm.tree.bt.no100_Same_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return Boolean.TRUE;
        }
        if (p == null || q == null) {
            return Boolean.FALSE;
        }
        if (p.val != q.val) {
            return Boolean.FALSE;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
