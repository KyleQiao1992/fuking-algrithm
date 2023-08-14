package com.kaitian.fukingalgrithm.tree.bt.no1602_Find_Nearest_Right_Node_in_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();


            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();

                //看看右边是不是有元素，有元素直接返回，没有元素返回null
                if (cur.val == u.val) {
                    return i < size - 1 ? q.peek() : null;
                }

                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
        }

        return null;
    }
}
