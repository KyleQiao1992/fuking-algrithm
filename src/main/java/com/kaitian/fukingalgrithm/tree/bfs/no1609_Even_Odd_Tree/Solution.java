package com.kaitian.fukingalgrithm.tree.bfs.no1609_Even_Odd_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isEven = level % 2 == 0;
            int preNum = isEven ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                if (isEven) {
                    if (cur.val % 2 == 0) {
                        return false;
                    }
                    if (cur.val <= preNum) {
                        return false;
                    }
                } else {
                    if (cur.val % 2 != 0) {
                        return false;
                    }
                    if (cur.val >= preNum) {
                        return false;
                    }
                }

                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
                preNum = cur.val;
            }
            level++;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.isEvenOddTree(node);
    }
}
