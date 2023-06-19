package com.kaitian.fukingalgrithm.tree.bt.no1261_Find_Elements_in_a_Contaminated_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    Set<Integer> values = new HashSet<>();

    public void FindElements(TreeNode root) {
        traverse(root, 0);
    }

    public boolean find(int target) {
        return values.contains(target);
    }

    private void traverse(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        root.val = val;
        values.add(val);

        traverse(root.left, 2 * val + 1);
        traverse(root.right, 2 * val + 2);
    }
}
