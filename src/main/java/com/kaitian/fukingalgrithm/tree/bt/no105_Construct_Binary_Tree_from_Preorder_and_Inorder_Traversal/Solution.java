package com.kaitian.fukingalgrithm.tree.bt.no105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Integer, Integer> inderValueIndexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        buildInOderValueIndexMap(inorder);


        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStartIdx, int preEndIdx,
                               int[] inorder, int inStartIdx, int inEndIdx) {
        if (preStartIdx > preEndIdx || inStartIdx > inEndIdx) {
            return null;
        }

        //build root
        Integer rootVal = preorder[preStartIdx];
        TreeNode root = new TreeNode(rootVal);

        Integer inOrderRootIdx = inderValueIndexMap.get(rootVal);
        Integer leftTreeLength = inOrderRootIdx - inStartIdx;

        root.left = buildTree(
                preorder, preStartIdx + 1, preEndIdx + leftTreeLength,
                inorder, inStartIdx, inOrderRootIdx - 1);

        root.right = buildTree(
                preorder, preStartIdx + leftTreeLength + 1, preEndIdx,
                inorder, inOrderRootIdx + 1, inEndIdx);
        return root;
    }

    private void buildInOderValueIndexMap(int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inderValueIndexMap.put(inorder[i], i);
        }
    }

    public static void main(String[] args) {
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};

        Solution solution = new Solution();
        TreeNode res = solution.buildTree(preOrder, inOrder);
        System.out.println(res);
    }

}
