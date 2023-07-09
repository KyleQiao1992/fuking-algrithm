package com.kaitian.fukingalgrithm.tree.bfs.no513_Find_Bottom_Left_Tree_Value;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Integer res = root.val;

        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer tempLeft = null;

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                if (cur.left != null) {
                    queue.add(cur.left);

                    if (tempLeft == null) {
                        tempLeft = cur.left.val;
                    }
                }

                if (cur.right != null) {
                    queue.add(cur.right);

                    if (tempLeft == null) {
                        tempLeft = cur.right.val;
                    }
                }
            }

            res = tempLeft == null ? res : tempLeft;
        }

        return res;
    }
}
