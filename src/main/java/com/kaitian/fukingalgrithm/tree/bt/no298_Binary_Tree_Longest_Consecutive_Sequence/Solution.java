package com.kaitian.fukingalgrithm.tree.bt.no298_Binary_Tree_Longest_Consecutive_Sequence;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

    private int res = 0;

    public int longestConsecutive(TreeNode root) {
        traverse(root, 1, Integer.MIN_VALUE);
        return res;
    }

    private void traverse(TreeNode root, int len, int parentVal) {
        if (root == null) {
            return;
        }

        if (parentVal + 1 == root.val) {
            len++;
        } else {
            len = 1;
        }

        res = Math.max(len, res);

        traverse(root.left, len, root.val);
        traverse(root.right, len, root.val);
    }
}
