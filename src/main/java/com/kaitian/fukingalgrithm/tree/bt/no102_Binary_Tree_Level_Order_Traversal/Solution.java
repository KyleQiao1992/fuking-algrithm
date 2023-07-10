package com.kaitian.fukingalgrithm.tree.bt.no102_Binary_Tree_Level_Order_Traversal;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    private List<LinkedList<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root);
        List<List<Integer>> list = new ArrayList<>(res);
        return list;
    }

    private int depth = 0;

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        LinkedList<Integer> list;
        if (depth >= res.size() || res.get(depth) == null) {
            list = new LinkedList<>();
            list.addLast(root.val);
            res.add(depth, list);
        } else {
            list = res.get(depth);
            list.addLast(root.val);
        }

        depth++;
        traverse(root.left);
        traverse(root.right);
        depth--;
    }

    public static void main(String[] args) {
        Integer[] nums = {3, 9, 20, null, null, 15, 7};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.traverse(node);
    }
}
