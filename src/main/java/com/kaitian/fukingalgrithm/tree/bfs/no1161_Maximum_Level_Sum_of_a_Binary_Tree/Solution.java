package com.kaitian.fukingalgrithm.tree.bfs.no1161_Maximum_Level_Sum_of_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class Solution {

    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;
        int res = 0, maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                levelSum += cur.val;

                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }

            if (levelSum > maxSum) {
                res = depth;
                maxSum = levelSum;
            }
            depth++;
        }
        return res;
    }

}
