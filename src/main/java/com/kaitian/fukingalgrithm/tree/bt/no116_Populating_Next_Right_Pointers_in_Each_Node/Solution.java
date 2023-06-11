package com.kaitian.fukingalgrithm.tree.bt.no116_Populating_Next_Right_Pointers_in_Each_Node;

public class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        traverse(root.left, root.right);
        return root;
    }

    public void traverse(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }

        node1.next = node2;

        traverse(node1.right, node2.left);
        traverse(node1.left, node1.right);
        traverse(node2.left, node2.right);
    }
}
