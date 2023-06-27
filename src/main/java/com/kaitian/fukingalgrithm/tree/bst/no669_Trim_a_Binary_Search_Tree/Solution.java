package com.kaitian.fukingalgrithm.tree.bst.no669_Trim_a_Binary_Search_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    //函数定义： 删除BST中小于low,大于high的所有节点，并返回结果BST的根节点
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }

//        if (root.val < low) {
//            return root.right;
//        }
//
//        if (root.val > high) {
//            return root.left;
//        }

        if (root.val < low) {
            return trimBST(root.right, low, high);
        }

        if (root.val > high) {
            return trimBST(root.left, low, high);
        }

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
