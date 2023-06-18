package com.kaitian.fukingalgrithm.tree.bt.no993_Cousins_in_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int deepth = 0;
    private int xDeepth = 0;
    private int xRootVal = 0;
    private int yDeepth = 0;
    private int yRootVal = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        traverse(root, root.val, x, y);
        return xRootVal != yRootVal && xDeepth == yDeepth;
    }

    private void traverse(TreeNode root, int patentRoot, int x, int y) {
        if (root == null) {
            return;
        }

        deepth++;
        if (root.val == x) {
            xDeepth = deepth;
            xRootVal = patentRoot;
            deepth--;
            return;
        }
        if (root.val == y) {
            yDeepth = deepth;
            yRootVal = patentRoot;
            deepth--;
            return;
        }
        traverse(root.left, root.val, x, y);
        traverse(root.right, root.val, x, y);
        deepth--;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, null, 4};
        TreeNode node = TreeNode.constructTree(nums);
        Solution f = new Solution();
        f.isCousins(node, 2, 3);
    }
}
