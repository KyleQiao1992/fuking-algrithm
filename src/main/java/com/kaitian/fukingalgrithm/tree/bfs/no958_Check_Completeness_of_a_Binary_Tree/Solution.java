package com.kaitian.fukingalgrithm.tree.bfs.no958_Check_Completeness_of_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean end = false;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                if (cur == null) {
                    end = true;
                } else {
                    if (end) {
                        return false;
                    }
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }
            }
        }
        return true;
    }
}
