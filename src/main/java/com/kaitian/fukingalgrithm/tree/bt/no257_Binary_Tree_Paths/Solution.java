package com.kaitian.fukingalgrithm.tree.bt.no257_Binary_Tree_Paths;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<String> res = new ArrayList<>();

    private LinkedList<String> temp = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        temp.add(String.valueOf(root.val));

        if (root.left == null && root.right == null) {
            res.add(String.join("->", temp));
            temp.removeLast();
            return;
        }

        traverse(root.left);
        traverse(root.right);

        temp.removeLast();
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        Integer[] nums = {1, 2, 3, null, 5};
        TreeNode treeNode = TreeNode.constructTree(nums);
        List<String> res = f.binaryTreePaths(treeNode);
    }
}
