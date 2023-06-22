package com.kaitian.fukingalgrithm.tree.construct.no1110_Delete_Nodes_And_Return_Forest;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.*;

public class Solution {
    private Set<Integer> delSet = new HashSet<>();
    private List<TreeNode> res = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        if (root == null) {
            return res;
        }

        for (int d : to_delete) {
            delSet.add(d);
        }
        doDelete(root, false);
        return res;
    }

    // 定义：输入一棵二叉树，删除 delSet 中的节点，返回删除完成后的根节点
    private TreeNode doDelete(TreeNode root, boolean hasParent) {
        if (root == null) {
            return null;
        }

        boolean deleted = delSet.contains(root.val);
        if (!deleted && !hasParent) {
            res.add(root);
        }
        root.left = doDelete(root.left, !deleted);
        root.right = doDelete(root.right, !deleted);
        return deleted ? null : root;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.delNodes(node, new int[]{3, 5});
    }
}
