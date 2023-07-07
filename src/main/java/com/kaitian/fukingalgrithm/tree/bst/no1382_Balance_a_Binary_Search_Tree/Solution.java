package com.kaitian.fukingalgrithm.tree.bst.no1382_Balance_a_Binary_Search_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public TreeNode balanceBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        traverse(root);
        List<Integer> list = res;
        return build(list, 0, list.size() - 1);
    }

    private TreeNode build(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = build(list, start, mid - 1);
        root.right = build(list, mid + 1, end);
        return root;
    }

    List<Integer> res = new ArrayList<>();

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}
