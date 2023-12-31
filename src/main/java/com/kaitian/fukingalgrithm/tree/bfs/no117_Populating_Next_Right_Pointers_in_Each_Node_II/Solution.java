package com.kaitian.fukingalgrithm.tree.bfs.no117_Populating_Next_Right_Pointers_in_Each_Node_II;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            Node pre = null;

            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();

                if (pre != null) {
                    pre.next = cur;
                }
                pre = cur;

                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
        return root;
    }
}
