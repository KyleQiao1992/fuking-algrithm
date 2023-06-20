package com.kaitian.fukingalgrithm.tree.bt.no1660_Correct_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private Set<TreeNode> visited = new HashSet<>();

    public TreeNode correctBinaryTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.right != null && visited.contains(root.right)) {
            return null;
        }

        visited.add(root);
        root.right = correctBinaryTree(root.right);
        root.left = correctBinaryTree(root.left);

        return root;
    }
}
