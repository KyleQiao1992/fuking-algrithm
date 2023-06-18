package com.kaitian.fukingalgrithm.tree.bt.no988_Smallest_String_Starting_From_Leaf;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private StringBuilder path = new StringBuilder();
    private String res = null;

    public String smallestFromLeaf(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            path.append((char) ('a' + root.val));
            path.reverse();

            String s = path.toString();
            if (res == null || res.compareTo(s) > 0) {
                res = s;
            }

            path.reverse();
            path.deleteCharAt(path.length() - 1);
            return;
        }

        path.append((char) ('a' + root.val));
        traverse(root.left);
        traverse(root.right);

        path.deleteCharAt(path.length() - 1);
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        Integer[] nums = {0, 1, 2, 3, 4, 3, 4};
        TreeNode node = TreeNode.constructTree(nums);
        f.traverse(node);
    }

}
