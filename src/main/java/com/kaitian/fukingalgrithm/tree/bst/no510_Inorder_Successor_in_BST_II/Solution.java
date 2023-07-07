package com.kaitian.fukingalgrithm.tree.bst.no510_Inorder_Successor_in_BST_II;

public class Solution {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    }


    public Node inorderSuccessor(Node node) {
        Node p = node.right;
        while (p != null && p.left != null) {
            p = p.left;
        }

        if (p != null) {
            return p;
        }

        p = node;
        while (p.parent != null && p.parent.right == p) {
            p = p.parent;
        }

        return p.parent;
    }
}
