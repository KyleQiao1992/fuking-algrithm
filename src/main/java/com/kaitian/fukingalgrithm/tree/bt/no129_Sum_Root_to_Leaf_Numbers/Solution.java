package com.kaitian.fukingalgrithm.tree.bt.no129_Sum_Root_to_Leaf_Numbers;

import com.kaitian.fukingalgrithm.tree.TreeNode;


public class Solution {

    private int res = 0;
    private StringBuffer path = new StringBuffer();

    public int sumNumbers(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        path.append(root.val);
        if (root.left == null && root.right == null) {
            res += Integer.parseInt(path.toString());

            path.deleteCharAt(path.length() - 1);
            return;
        }

        traverse(root.left);
        traverse(root.right);

        path.deleteCharAt(path.length() - 1);
    }
}
