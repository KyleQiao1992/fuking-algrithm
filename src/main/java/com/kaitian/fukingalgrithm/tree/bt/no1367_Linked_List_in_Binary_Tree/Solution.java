package com.kaitian.fukingalgrithm.tree.bt.no1367_Linked_List_in_Binary_Tree;

import com.kaitian.fukingalgrithm.linked_list.ListNode;
import com.kaitian.fukingalgrithm.tree.TreeNode;

public class Solution {

    public boolean isSubPath(ListNode head, TreeNode root) {
        // base case
        if (head == null) return true;
        if (root == null) return false;
        // 当找到一个二叉树节点的值等于链表头结点时
        if (head.val == root.val) {
            // 判断是否能把链表嵌进去
            if (check(head, root)) {
                return true;
            }
        }
        // 继续去遍历其他节点尝试嵌入链表
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    // 检查是否能够将链表嵌入二叉树
    public boolean check(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;

        if (head.val == root.val) {
            // 在子树上嵌入子链表
            return check(head.next, root.left) || check(head.next, root.right);
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(4);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(8);

        a.next = b;
        b.next = c;

        Integer[] nums = {1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3};
        TreeNode root = TreeNode.constructTree(nums);

        Solution f = new Solution();
        f.check(a, root);
    }
}
