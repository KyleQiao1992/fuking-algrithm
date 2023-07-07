package com.kaitian.fukingalgrithm.tree.dfs.no102_Binary_Tree_Level_Order_Traversal;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();

                level.addLast(cur.val);
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            res.addLast(level);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        Integer[] nums = {3, 9, 20, null, null, 15, 7};
        TreeNode node = TreeNode.constructTree(nums);
        f.levelOrder(node);
    }
}
