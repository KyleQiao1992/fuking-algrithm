package com.kaitian.fukingalgrithm.tree.construct.no297_Serialize_and_Deserialize_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;

public class Solution {
    public class Codec {
        String SEP = ",";
        String NULL = "#";

        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            serialize(root, sb);
            return sb.toString();
        }

        void serialize(TreeNode root, StringBuilder sb) {
            if (root == null) {
                sb.append(NULL).append(SEP);
                return;
            }

            /******前序遍历位置******/
            sb.append(root.val).append(SEP);
            /***********************/

            serialize(root.left, sb);
            serialize(root.right, sb);
        }

        public TreeNode deserialize(String data) {
            LinkedList<String> nodes = new LinkedList<>();
            for (String s : data.split(SEP)) {
                nodes.addLast(s);
            }
            return deserialize(nodes);
        }

        TreeNode deserialize(LinkedList<String> nodes) {
            if (nodes.isEmpty()) return null;

            /******前序遍历位置******/
            // 列表最左侧就是根节点
            String first = nodes.removeFirst();
            if (first.equals(NULL)) return null;
            TreeNode root = new TreeNode(Integer.parseInt(first));
            /***********************/

            root.left = deserialize(nodes);
            root.right = deserialize(nodes);

            return root;
        }
    }
}
