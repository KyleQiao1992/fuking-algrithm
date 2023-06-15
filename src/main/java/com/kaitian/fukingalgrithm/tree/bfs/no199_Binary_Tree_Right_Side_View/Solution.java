package com.kaitian.fukingalgrithm.tree.bfs.no199_Binary_Tree_Right_Side_View;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

//BFS解法
public class Solution {
    private List<Integer> res = new ArrayList<>();
    private int depth = 0;

    public List<Integer> rightSideView(TreeNode root) {
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        depth++;
        if (res.size() < depth) {
            res.add(root.val);
        }

        traverse(root.right);
        traverse(root.left);
        depth--;
    }

    public static void main(String[] args) {

    }
}
