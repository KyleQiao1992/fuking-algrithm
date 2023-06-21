package com.kaitian.fukingalgrithm.tree.bt.no1430_Check_If_a_String_Is_a_Valid_Sequence_from_Root_to_Leaves_Path_in_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {

    public boolean isValidSequence(TreeNode root, int[] arr) {
        return check(root, arr, 0);
    }

    private boolean check(TreeNode root, int[] arr, int i) {
        if (root == null || i == arr.length) {
            return false;
        }
        if (root.val != arr[i]) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return arr[i] == root.val && i == arr.length - 1;
        }

        return check(root.left, arr, i + 1) || check(root.right, arr, i + 1);
    }
}
