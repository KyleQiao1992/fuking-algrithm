package com.kaitian.fukingalgrithm.tree.bt.no1315_Sum_of_Nodes_with_Even_Valued_Grandparent;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int res = 0;

    public int sumEvenGrandparent(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        //祖父节点不为空，且为偶数
        if (root.val % 2 == 0) {
            if (root.left != null) {
                if (root.left.left != null) {
                    res += root.left.left.val;
                }
                if (root.left.right != null) {
                    res += root.left.right.val;
                }
            }

            if (root.right != null) {
                if (root.right.left != null) {
                    res += root.right.left.val;
                }
                if (root.right.right != null) {
                    res += root.right.right.val;
                }
            }
        }

        traverse(root.left);
        traverse(root.right);
    }
}
