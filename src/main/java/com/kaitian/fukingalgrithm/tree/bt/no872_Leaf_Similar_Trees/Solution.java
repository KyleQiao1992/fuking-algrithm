package com.kaitian.fukingalgrithm.tree.bt.no872_Leaf_Similar_Trees;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverse(root1);
        List<Integer> list1 = new ArrayList<>(res);
        res = new ArrayList<>();

        traverse(root2);
        List<Integer> list2 = new ArrayList<>(res);


        return list1.equals(list2);
    }

    private List<Integer> res = new ArrayList<>();

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            res.add(root.val);
        }
        traverse(root.left);
        traverse(root.right);
    }

    public static void main(String[] args) {
        Integer[] nums = {3, 5, 1, 6, 2, 9, 8, null, null, 7, 4};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.traverse(node);
    }
}
