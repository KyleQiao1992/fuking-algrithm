package com.kaitian.fukingalgrithm.tree.bt.no872_Leaf_Similar_Trees;

import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.Stack;

public class Solution2 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        LeafIterator it1 = new LeafIterator(root1);
        LeafIterator it2 = new LeafIterator(root2);
        // 逐一对比叶子节点
        while (it1.hasNext() && it2.hasNext()) {
            if (it1.next().val != it2.next().val) {
                return false;
            }
        }
        // 最后应该都完成遍历
        return !it1.hasNext() && !it2.hasNext();
    }


    // 一个生成二叉树叶子节点的迭代器
    class LeafIterator {
        // 模拟递归过程
        private Stack<TreeNode> stk = new Stack<>();

        public LeafIterator(TreeNode root) {
            stk.push(root);
        }

        public boolean hasNext() {
            return !stk.isEmpty();
        }

        public TreeNode next() {
            while (!stk.isEmpty()) {
                TreeNode cur = stk.pop();
                if (cur.left == null && cur.right == null) {
                    // 发现一个叶子结点
                    return cur;
                }
                // 先入栈 root.right
                if (cur.right != null) {
                    stk.push(cur.right);
                }
                if (cur.left != null) {
                    stk.push(cur.left);
                }
            }
            return null;
        }
    }
}