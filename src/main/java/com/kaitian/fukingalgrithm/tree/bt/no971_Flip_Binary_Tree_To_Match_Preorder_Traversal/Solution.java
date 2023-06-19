package com.kaitian.fukingalgrithm.tree.bt.no971_Flip_Binary_Tree_To_Match_Preorder_Traversal;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        this.voyage = voyage;
        if (canFlip) {
            return res;
        }
        return Collections.singletonList(-1);
    }

    List<Integer> res = new ArrayList<>();
    private int[] voyage;
    private int i = 0;
    boolean canFlip = true;

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.val != voyage[i++]) {
            canFlip = false;
            return;
        }

        if (root.left != null && root.left.val != voyage[i]) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            res.add(root.val);
        }

        traverse(root.left);
        traverse(root.right);
    }
}
