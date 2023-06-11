package com.kaitian.fukingalgrithm.tree.bt.no652_Find_Duplicate_Subtrees;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.*;

public class Solution {
    private Map<String, Integer> memo = new HashMap<>();
    private LinkedList<TreeNode> res = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if (root == null) {
            return res;
        }
        traverse(root);
        return res;
    }

    private String traverse(TreeNode root) {
        if (root == null) {
            return "#";
        }

        String leftTree = traverse(root.left);
        String rightTree = traverse(root.right);
        String subTree = leftTree + "," + rightTree + "," + root.val;

        int freq = memo.getOrDefault(subTree, 0);
        // 多次重复也只会被加入结果集一次
        if (freq == 1) {
            res.add(root);
        }
        // 给子树对应的出现次数加一
        memo.put(subTree, freq + 1);
        return subTree;
    }
}
