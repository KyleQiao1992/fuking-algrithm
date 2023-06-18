package com.kaitian.fukingalgrithm.tree.bt.no1469_Find_All_The_Lonely_Nodes;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> res = new ArrayList<>();

    public List<Integer> getLonelyNodes(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {

            res.add(root.left.val);
        }

        if (root.left == null && root.right != null) {
            res.add(root.right.val);
        }

        traverse(root.left);
        traverse(root.right);
    }
}
