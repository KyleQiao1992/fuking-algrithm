package com.kaitian.fukingalgrithm.tree.bst.no449_Serialize_and_Deserialize_BST;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;

public class Solution {

    private StringBuilder res = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }

        String left = serialize(root.left);
        String right = serialize(root.right);

        return root.val + "," + left + "," + right;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> list = new LinkedList<>();
        for (String s : data.split(",")) {
            list.addLast(s);
        }
        return build(list);
    }

    private TreeNode build(LinkedList<String> list) {
        if (list.isEmpty()) {
            return null;
        }

        String first = list.removeFirst();
        if ("#".equals(first)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(first));
        root.left = build(list);
        root.right = build(list);
        return root;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        Integer[] nums = {2, 1, 3};
        TreeNode node = TreeNode.constructTree(nums);
        String res = f.serialize(node);
    }
}
