package com.kaitian.fukingalgrithm.tree.bt.no366_Find_Leaves_of_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> findLeaves(TreeNode root) {
        maxDepth(root);
        return res;
    }

    //定义：输入节点root,返回以root为根的树的最大深度
    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = maxDepth(root.left);
        int rightH = maxDepth(root.right);

        int h = Math.max(leftH, rightH) + 1;

        if (res.size() < h) {
            res.add(new ArrayList<>());
        }
        res.get(h - 1).add(root.val);
        return h;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.findLeaves(node);
    }
}
