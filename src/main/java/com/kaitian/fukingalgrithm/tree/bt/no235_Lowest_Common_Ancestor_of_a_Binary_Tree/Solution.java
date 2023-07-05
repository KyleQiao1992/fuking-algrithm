package com.kaitian.fukingalgrithm.tree.bt.no235_Lowest_Common_Ancestor_of_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    /**
     * 1、如果 p 和 q 都比当前节点小，那么显然 p 和 q 都在左子树，那么 LCA 在左子树。
     * 2、如果 p 和 q 都比当前节点大，那么显然 p 和 q 都在右子树，那么 LCA 在右子树。
     * 3、一旦发现 p 和 q 在当前节点的两侧，说明当前节点就是 LCA。
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p.val > q.val) {
            return lowestCommonAncestor(root, q, p);
        }

        if (root.val >= p.val && root.val <= q.val) {
            return root;
        }

        if (root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
