package com.kaitian.fukingalgrithm.tree.bst.no173_Binary_Search_Tree_Iterator;

import com.kaitian.fukingalgrithm.tree.TreeNode;


import java.util.Stack;

public class BSTIterator {

    Stack<TreeNode> stk = new Stack<>();

    private void pushLeftBranch(TreeNode p) {
        while (p != null) {
            stk.push(p);
            p = p.left;
        }
    }

    public BSTIterator(TreeNode root) {
        pushLeftBranch(root);
    }

    public int next() {
        TreeNode p = stk.pop();
        pushLeftBranch(p.right);
        return p.val;
    }

    public boolean hasNext() {
        return !stk.isEmpty();
    }
}
