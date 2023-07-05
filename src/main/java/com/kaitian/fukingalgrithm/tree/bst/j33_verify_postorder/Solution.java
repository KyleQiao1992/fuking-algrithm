package com.kaitian.fukingalgrithm.tree.bst.j33_verify_postorder;

public class Solution {

    public boolean verifyPostorder(int[] postorder) {
        return check(postorder, 0, postorder.length - 1);
    }

    //定义： 检查postorder[i,j] 是否是一个合法的BST
    private boolean check(int[] postorder, int i, int j) {
        if (i >= j) {
            return true;
        }

        int rootVal = postorder[j];
        int left = i;

        //找到第一个大于root的值
        while (left < j && postorder[left] < rootVal) {
            left++;
        }

        int right = left;
        while (right < j && postorder[right] > rootVal) {
            right++;
        }
        if (right != j) {
            return false;
        }

        return check(postorder, i, left) && check(postorder, left + 1, j - 1);
    }
}
