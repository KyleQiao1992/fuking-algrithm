package com.kaitian.fukingalgrithm.tree.bfs.no515_Find_Largest_Value_in_Each_Tree_Row;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            int maxNum = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                maxNum = Math.max(maxNum, cur.val);

                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            res.add(maxNum);
        }
        return res;
    }
}
