package com.kaitian.fukingalgrithm.tree.bst.no255_Verify_Preorder_Sequence_in_Binary_Search_Tree;

public class Solution {


    public boolean verifyPreorder(int[] preorder) {
        int n = preorder.length;
        return check(preorder, 0, n - 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // 定义：检查 preorder[start..end] 是否能够组成一棵值在 [min, max] 中的 BST
    boolean check(int[] preorder, int start, int end, int min, int max) {
        if (start > end) {
            return true;
        }
        int rootVal = preorder[start];
        if (rootVal < min || rootVal > max) {
            return false;
        }

        int p = start + 1;
        while (p <= end && preorder[p] < rootVal) {
            p++;
        }
        return check(preorder, start + 1, p - 1, min, rootVal) &&
                check(preorder, p, end, rootVal, max);
    }

}
