package com.kaitian.fukingalgrithm.tree.bt.no987_Vertical_Order_Traversal_of_a_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    class Co_TreeNode {
        public int row, col;
        public TreeNode node;

        public Co_TreeNode(TreeNode node, int row, int col) {
            this.row = row;
            this.col = col;
            this.node = node;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traverse(root, 0, 0);

        nodes.sort((Co_TreeNode a, Co_TreeNode b) -> {
            if (a.col == b.col && a.row == b.row) {
                return a.node.val - b.node.val;
            }
            if (a.col == b.col) {
                return a.row - b.row;
            }
            return a.col - b.col;
        });

        LinkedList<List<Integer>> res = new LinkedList<>();
        int preCol = Integer.MIN_VALUE;
        for (Co_TreeNode cur : nodes) {
            if (cur.col != preCol) {
                res.addLast(new LinkedList<>());
                preCol = cur.col;
            }
            res.getLast().add(cur.node.val);
        }
        return res;
    }

    List<Co_TreeNode> nodes = new ArrayList<>();

    private void traverse(TreeNode root, int row, int col) {
        if (root == null) {
            return;
        }
        nodes.add(new Co_TreeNode(root, row, col));

        traverse(root.left, row + 1, col - 1);
        traverse(root.right, row + 1, col + 1);
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        Integer[] nums = {3, 9, 20, null, null, 15, 7};
        TreeNode node = TreeNode.constructTree(nums);
        f.verticalTraversal(node);
    }
}
