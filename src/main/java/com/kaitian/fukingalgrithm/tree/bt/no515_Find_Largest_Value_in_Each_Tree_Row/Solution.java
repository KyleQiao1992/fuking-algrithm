package com.kaitian.fukingalgrithm.tree.bt.no515_Find_Largest_Value_in_Each_Tree_Row;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> res = new ArrayList<>();
    private int depth = 0;

    public List<Integer> largestValues(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (depth >= res.size() || res.get(depth) == null) {
            res.add(depth, root.val);
        } else {
            Integer num = res.get(depth);
            res.remove(depth);
            res.add(depth, Math.max(num, root.val));
        }

        depth++;
        traverse(root.left);
        traverse(root.right);
        depth--;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 3, 2, 5, 3, null, 9};
        TreeNode treeNode = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.largestValues(treeNode);
    }
}
