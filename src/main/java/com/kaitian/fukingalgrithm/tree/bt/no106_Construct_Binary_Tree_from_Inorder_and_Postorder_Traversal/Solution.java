package com.kaitian.fukingalgrithm.tree.bt.no106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    //key:inOderValue  value: index
    private Map<Integer, Integer> inOderMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) {
            return null;
        }
        buildInTreeMap(inorder);
        return buildTree(inorder, 0, inorder.length - 1, postorder,

                0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inStartIdx, int inEndIdx,
                               int[] postorder, int postStartIdx, int postEndIdx) {

        if (inStartIdx > inEndIdx || postStartIdx > postEndIdx) {
            return null;
        }

        int rootVal = postorder[postEndIdx];
        TreeNode root = new TreeNode(rootVal);
        int rootInOrderIdx = inOderMap.get(rootVal);

        int postOrderLeftTreeLength = rootInOrderIdx - inStartIdx;

        root.left = buildTree(inorder, inStartIdx, rootInOrderIdx - 1,
                postorder, postStartIdx, postStartIdx + postOrderLeftTreeLength - 1);
        root.right = buildTree(inorder, rootInOrderIdx + 1, inEndIdx,
                postorder, postStartIdx + postOrderLeftTreeLength, postEndIdx - 1);
        return root;
    }

    private void buildInTreeMap(int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inOderMap.put(inorder[i], i);
        }
    }
}
