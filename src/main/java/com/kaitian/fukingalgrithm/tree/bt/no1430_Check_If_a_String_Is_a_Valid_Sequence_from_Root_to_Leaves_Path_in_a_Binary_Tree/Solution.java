package com.kaitian.fukingalgrithm.tree.bt.no1430_Check_If_a_String_Is_a_Valid_Sequence_from_Root_to_Leaves_Path_in_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private boolean res = false;
    private int[] arr;
    private int i = 0;

    public boolean isValidSequence(TreeNode root, int[] arr) {
        this.i = 0;
        this.arr = arr;

        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null || i > arr.length - 1) {
            return;
        }

        if (root.val != arr[i]) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (i == arr.length - 1) {
                res = true;
            }
            return;
        }

        i++;
        traverse(root.left);
        traverse(root.right);
        i--;
    }

    public static void main(String[] args) {

        Integer[] nums = {0, 1, 0, 0, 1, 0, null, null, 1, 0, 0};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        int[] arr = {0, 1, 0, 1};
        f.isValidSequence(node, arr);
    }
}
