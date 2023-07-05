package com.kaitian.fukingalgrithm.tree.bst.no449_Serialize_and_Deserialize_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;

public class Solution2 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        sb.append(root.val).append(",");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }
        LinkedList<Integer> inorder = new LinkedList<>();
        for (String s : data.split(",")) {
            inorder.offer(Integer.parseInt(s));
        }
        return deserialize(inorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode deserialize(LinkedList<Integer> nodes, int min, int max) {
        if (nodes.isEmpty()) {
            return null;
        }

        int rootVal = nodes.getFirst();
        if (rootVal > max || rootVal < min) {
            return null;
        }
        nodes.removeFirst();
        TreeNode root = new TreeNode(rootVal);
        root.left = deserialize(nodes, min, rootVal);
        root.right = deserialize(nodes, rootVal, max);
        return root;
    }
}
