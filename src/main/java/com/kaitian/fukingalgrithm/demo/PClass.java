package com.kaitian.fukingalgrithm.demo;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import javax.swing.plaf.ListUI;
import java.util.*;

public class PClass {

    public List<TreeNode> generateTrees(int n) {

        return build(1, n);
    }

    //返回闭区间[lo,hi]组成的BST
    private List<TreeNode> build(int lo, int hi) {
        List<TreeNode> res = new LinkedList<>();
        if (lo > hi) {
            res.add(null);
            return res;
        }

        for (int i = lo; i <= hi; i++) {

            List<TreeNode> leftTree = build(lo, i - 1);
            List<TreeNode> rightTree = build(i + 1, hi);

            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;

                    res.add(root);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PClass f = new PClass();
        Integer[] nums = {1, 2, 3, null, null, 4, 5};
        TreeNode node = TreeNode.constructTree(nums);
//        f.numTrees(3);
    }

}
