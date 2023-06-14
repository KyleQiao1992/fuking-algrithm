package com.kaitian.fukingalgrithm.tree.ntree.no590_N_ary_Tree_Postorder_Traversal;

import com.kaitian.fukingalgrithm.tree.ntree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> res = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        traverse(root);
        return res;
    }

    private void traverse(Node root) {
        if (root == null) {
            return;
        }

        for (Node node : root.children) {
            traverse(node);
        }
        res.add(root.val);
    }
}
