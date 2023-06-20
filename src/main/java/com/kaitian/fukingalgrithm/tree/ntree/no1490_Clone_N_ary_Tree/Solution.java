package com.kaitian.fukingalgrithm.tree.ntree.no1490_Clone_N_ary_Tree;

import com.kaitian.fukingalgrithm.tree.ntree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public Node cloneTree(Node root) {
        return traverse(root);
    }

    private Node traverse(Node root) {
        if (root == null) {
            return null;
        }
        Node rootNew = new Node(root.val);
        List<Node> children = new ArrayList<>();

        for (Node child : root.children) {
            children.add(traverse(child));
        }

        rootNew.children = children;
        return rootNew;
    }
}
