package com.kaitian.fukingalgrithm.tree.construct.no1485_Clone_Binary_Tree_With_Random_Pointer;

import com.kaitian.fukingalgrithm.tree.ntree.Node;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private class NodeCopy {
        private int val;
        private NodeCopy left;
        private NodeCopy right;
        private NodeCopy random;

        public NodeCopy() {
        }

        public NodeCopy(int val) {
            this.val = val;
        }
    }

    Map<Node, NodeCopy> nodeToCopy = new HashMap<>();

    public NodeCopy copyRandomBinaryTree(Node root) {
        if (root == null) {
            return null;
        }

        if (nodeToCopy.containsKey(root)) {
            return nodeToCopy.get(root);
        }

        NodeCopy rootCopy = new NodeCopy(root.val);
        nodeToCopy.put(root, rootCopy);

//        rootCopy.left = copyRandomBinaryTree(root.left);
//        rootCopy.right = copyRandomBinaryTree(root.right);
//        rootCopy.random = copyRandomBinaryTree(root.random);

        return rootCopy;
    }
}
