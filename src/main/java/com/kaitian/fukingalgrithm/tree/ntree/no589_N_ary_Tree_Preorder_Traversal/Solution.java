package com.kaitian.fukingalgrithm.tree.ntree.no589_N_ary_Tree_Preorder_Traversal;

import com.kaitian.fukingalgrithm.tree.ntree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return null;
        }
        traverse(root);
        return res;
    }

    private void traverse(Node root) {
        if (root == null) {
            return;
        }

        res.add(root.val);

        for (Node node : root.children) {
            preorder(node);
        }
    }
}
