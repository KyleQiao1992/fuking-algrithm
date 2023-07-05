package com.kaitian.fukingalgrithm.tree.bst.no1305_All_Elements_in_Two_Binary_Search_Trees;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        BSTIterator bst1 = new BSTIterator(root1);
        BSTIterator bst2 = new BSTIterator(root2);

        List<Integer> res = new ArrayList<>();

        while (bst1.hasNext() && bst2.hasNext()) {
            if (bst1.peek() > bst2.peek()) {
                res.add(bst2.next());
            } else {
                res.add(bst1.next());
            }
        }

        while (bst1.hasNext()) {
            res.add(bst1.next());
        }

        while (bst2.hasNext()) {
            res.add(bst2.next());
        }

        return res;
    }


    private class BSTIterator {
        private Deque<TreeNode> stack = new ArrayDeque<>();

        public BSTIterator(TreeNode root) {
            pushLeftBranch(root);
        }

        public int peek() {
            if (stack.isEmpty()) {
                return -1;
            }
            return stack.peek().val;
        }

        private void pushLeftBranch(TreeNode p) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
        }

        public int next() {
            TreeNode p = stack.pop();
            pushLeftBranch(p.right);
            return p.val;
        }

        private boolean hasNext() {
            return !stack.isEmpty();
        }
    }

}
