package com.kaitian.fukingalgrithm.tree.bt.no623_Add_One_Row_to_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    private int curDepth = 0;
    private int valT ;
    private int deepT ;

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        this.valT = val;
        this.deepT = depth;
        //头节点特殊处理
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        traverse(root);
        return root;
    }


    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        curDepth++;
        if (deepT-1 == curDepth) {
            TreeNode leftTree = root.left;
            TreeNode rightTree = root.right;

            root.left = new TreeNode(valT);
            root.right = new TreeNode(valT);

            root.left.left = leftTree;
            root.right.right = rightTree;

            curDepth--;
            return;
        }


        traverse(root.left);
        traverse(root.right);
        curDepth--;
    }

    public static void main(String[] args) {
        Integer[] nums = {4, 2, 6, 3, 1, 5};
        TreeNode node = TreeNode.constructTree(nums);

        Solution f = new Solution();
        f.addOneRow(node, 1, 2);
    }
}
