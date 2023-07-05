package com.kaitian.fukingalgrithm.tree.bst.no1214_Two_Sum_BSTs;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        List<Integer> list1 = traverse(root1);
        List<Integer> list2 = traverse(root2);

        int m = list1.size(), n = list2.size();
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            int sum = list1.get(i) + list2.get(j);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    private List<Integer> traverse(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        res.addAll(traverse(root.left));
        res.add(root.val);
        res.addAll(traverse(root.right));
        return res;
    }

}
