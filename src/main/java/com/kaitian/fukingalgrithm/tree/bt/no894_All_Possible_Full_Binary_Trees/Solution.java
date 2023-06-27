package com.kaitian.fukingalgrithm.tree.bt.no894_All_Possible_Full_Binary_Trees;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<TreeNode>[] memo;

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            return new LinkedList<>();
        }
        memo = new LinkedList[n + 1];
        return build(n);
    }

    private List<TreeNode> build(int n) {
        List<TreeNode> res = new LinkedList<>();
        //base case
        if (n == 1) {
            res.add(new TreeNode(0));
            return res;
        }
        if (memo[n] != null) {
            return memo[n];
        }

        for (int i = 1; i < n; i += 2) {
            int j = n - i - 1;

            List<TreeNode> leftSubTree = build(i);
            List<TreeNode> rightSubTree = build(j);

            //左右子树排列组合
            for (TreeNode left : leftSubTree) {
                for (TreeNode right : rightSubTree) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;

                    res.add(root);
                }
            }
        }

        memo[n] = res;
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.allPossibleFBT(7);
    }
}
