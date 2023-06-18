package com.kaitian.fukingalgrithm.demo;

import com.kaitian.fukingalgrithm.tree.TreeNode;
import com.kaitian.fukingalgrithm.tree.ntree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PClass {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return subRoot == null;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public static void main(String[] args) {
        PClass f = new PClass();
        Integer[] nums = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        TreeNode node = TreeNode.constructTree(nums);
//        f.pathSum(node, 22);
    }

}
