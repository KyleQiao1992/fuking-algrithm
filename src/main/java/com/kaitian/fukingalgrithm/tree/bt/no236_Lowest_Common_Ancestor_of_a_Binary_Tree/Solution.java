package com.kaitian.fukingalgrithm.tree.bt.no236_Lowest_Common_Ancestor_of_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    /**
     * 情况 1，如果 p 和 q 都在以 root 为根的树中，函数返回的即使 p 和 q 的最近公共祖先节点。
     * 情况 2，那如果 p 和 q 都不在以 root 为根的树中怎么办呢？函数理所当然地返回 null 呗。
     * 情况 3，那如果 p 和 q 只有一个存在于 root 为根的树中呢？函数就会返回那个节点。
     * 根据这个定义，分情况讨论：
     * 情况 1，如果 p 和 q 都在以 root 为根的树中，那么 left 和 right 一定分别是 p 和 q（从 base case 看出来的）。
     * 情况 2，如果 p 和 q 都不在以 root 为根的树中，直接返回 null。
     * 情况 3，如果 p 和 q 只有一个存在于 root 为根的树中，函数返回该节点。
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // base case
        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 情况 1
        if (left != null && right != null) {
            return root;
        }
        // 情况 2
        if (left == null && right == null) {
            return null;
        }
        // 情况 3
        return left == null ? right : left;
    }
}
