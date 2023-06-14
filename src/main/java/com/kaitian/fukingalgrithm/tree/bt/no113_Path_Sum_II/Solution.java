package com.kaitian.fukingalgrithm.tree.bt.no113_Path_Sum_II;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        traverse(root, new LinkedList<>(), targetSum);
        return res;
    }

    private void traverse(TreeNode root, LinkedList<Integer> list, int targetSum) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && targetSum == 0) {
            res.add(list);
            return;
        }

        list.addLast(root.val);
        traverse(root.left, list, targetSum - root.val);
        traverse(root.right, list, targetSum - root.val);
        list.removeLast();
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};

        TreeNode node = TreeNode.constructTree(nums);
        Solution solution = new Solution();
        solution.pathSum(node, 22);
    }
}
