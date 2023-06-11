package com.kaitian.fukingalgrithm.tree.bt.no572_Subtree_of_Another_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        // 我s都遍历完了。你居然还没匹配上。那就返回false
        if (s == null) {
            return Boolean.FALSE;
        }
        if (isSubtree(s.left, t) || isSubtree(s.right, t)) {
            return Boolean.TRUE;
        }
        return isSameTree(s, t);
    }

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
