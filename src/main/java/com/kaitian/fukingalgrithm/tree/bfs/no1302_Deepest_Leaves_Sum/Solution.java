package com.kaitian.fukingalgrithm.tree.bfs.no1302_Deepest_Leaves_Sum;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int resSum = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                sum += cur.val;
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            resSum = sum;
        }

        return resSum;
    }
}
