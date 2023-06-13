package com.kaitian.fukingalgrithm.recursion.no_leetcode_Generate_Binary_Number;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 请你实现一个函数，接受一个正整数 n，函数能够打印所有长度为 n 的二进制数。
 * 例如输入n = 3，算法打印000 001 010 011 100 101 110 111，共2^3 = 8个结果。函数签名如下：
 */
public class Solution {

    List<String> res = new ArrayList<>();
    private int level;

    public void generateBinaryNumber(int n) {
        TreeNode node = buildTree(-1, n);
        this.level = n;
        traverse(node.left, null);
        traverse(node.right, null);
    }

    private void traverse(TreeNode node, String str) {
        if (node == null) {
            return;
        }

        str = str == null ? String.valueOf(node.val) : str + String.valueOf(node.val);

        traverse(node.left, str);
        traverse(node.right, str);

        if (str.length() == level) {
            res.add(str);
        }
    }

    private TreeNode buildTree(int rootVal, int n) {
        if (n < 0) {
            return null;
        }
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(0, n - 1);
        root.right = buildTree(1, n - 1);
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateBinaryNumber(3);
    }

}
