package com.kaitian.fukingalgrithm.tree.bt.no1261_Find_Elements_in_a_Contaminated_Binary_Tree;

import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution2 {

    class FindElements {
        private TreeNode root;

        public FindElements(TreeNode root) {
            if (root == null) {
                return;
            }
            root.val = 0;
            traverse(root);
            this.root = root;
        }

        private void traverse(TreeNode root) {
            if (root == null) {
                return;
            }

            int x = root.val;
            if (root.left != null) {
                root.left.val = 2 * x + 1;
            }
            if (root.right != null) {
                root.right.val = 2 * x + 2;
            }

            traverse(root.left);
            traverse(root.right);
        }


        public boolean find(int target) {
            return contain(root, target);
        }

        private boolean contain(TreeNode root, int target) {
            if (root == null) {
                return false;
            }
            if (root.val == target) {
                return true;
            }
            return contain(root.left, target) || contain(root.right, target);
        }
    }
}
