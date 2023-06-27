package com.kaitian.fukingalgrithm.tree.bst.no1008_Construct_Binary_Search_Tree_from_Preorder_Traversal;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public TreeNode bstFromPreorder(int[] preorder) {

        return build(preorder, 0, preorder.length - 1);
    }

    private TreeNode build(int[] preorder, int start, int end) {
        if (start > end) {
            return null;
        }

        int rootVal = preorder[start];
        TreeNode root = new TreeNode(rootVal);

        int p = start + 1;
        while (p <= end && preorder[p] < rootVal) {
            p++;
        }

        root.left = build(preorder, start + 1, p - 1);
        root.right = build(preorder, p, end);
        return root;
    }

}
