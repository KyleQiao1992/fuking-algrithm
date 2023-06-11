package com.kaitian.fukingalgrithm.tree.bst.no700_search_in_a_binary_search_tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        return root.val > val ?
                searchBST(root.left, val) :
                searchBST(root.right, val);
    }
}
