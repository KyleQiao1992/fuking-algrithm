package com.kaitian.fukingalgrithm.tree.bt.lcp44_numColor;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> resSet = new HashSet<>();

    public int numColor(TreeNode root) {
        traverse(root);
        return resSet.size();
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        resSet.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
