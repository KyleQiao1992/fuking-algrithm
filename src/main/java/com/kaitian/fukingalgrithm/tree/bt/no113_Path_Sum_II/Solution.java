package com.kaitian.fukingalgrithm.tree.bt.no113_Path_Sum_II;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        traverse(root, targetSum);
        return res;
    }

    private void traverse(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }

        list.addLast(root.val);
        System.out.println("t1 root=" + root.val + ",list=" + list.toString());

        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            res.add(new LinkedList<>(list));
            list.removeLast();
            return;
        }

        traverse(root.left, targetSum - root.val);
        traverse(root.right, targetSum - root.val);

        list.removeLast();
    }


    public static void main(String[] args) {
        Integer[] nums = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        TreeNode node = TreeNode.constructTree(nums);
        Solution solution = new Solution();
        List<List<Integer>> res = solution.pathSum(node, 22);
        System.out.println("\n");
        System.out.println("res=" + res.toString());
    }
}
