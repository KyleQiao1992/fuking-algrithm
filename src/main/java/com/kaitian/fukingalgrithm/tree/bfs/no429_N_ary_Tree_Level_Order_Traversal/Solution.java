package com.kaitian.fukingalgrithm.tree.bfs.no429_N_ary_Tree_Level_Order_Traversal;

import com.kaitian.fukingalgrithm.tree.ntree.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {


    public List<List<Integer>> levelOrder(Node root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                level.add(cur.val);

                for (Node child : cur.children) {
                    queue.add(child);
                }
            }
            res.add(level);
        }

        return res;
    }
}
