package com.kaitian.fukingalgrithm.tree.bst.no230_Kth_Smallest_Element_in_a_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> resList = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        traverse(root);
        return resList.get(k - 1);
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.left);
        resList.add(node.val);
        traverse(node.right);
    }
}
