package com.kaitian.fukingalgrithm.tree.bt.no1022_Sum_of_Root_To_Leaf_Binary_Numbers;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<String> resList = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();

    public int sumRootToLeaf(TreeNode root) {
        traverse(root);
        int res = 0;
        for (String num : resList) {
            res += Integer.parseInt(num, 2);
        }
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        sb.append(root.val);

        if (root.left == null && root.right == null) {
            resList.add(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
            return;
        }

        traverse(root.left);
        traverse(root.right);

        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 0, 1, 0, 1, 0, 1};
        TreeNode treeNode = TreeNode.constructTree(nums);

        Solution f = new Solution();
        f.sumRootToLeaf(treeNode);
    }
}
