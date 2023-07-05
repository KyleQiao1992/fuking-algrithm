package com.kaitian.fukingalgrithm.tree.bst.no109_Convert_Sorted_List_to_Binary_Search_Tree;

import com.kaitian.fukingalgrithm.linked_list.ListNode;
import com.kaitian.fukingalgrithm.tree.TreeNode;


public class Solution {

    public TreeNode sortedListToBST(ListNode head) {
        return build(head, null);
    }

    private TreeNode build(ListNode start, ListNode end) {
        if (start == end) {
            return null;
        }

        ListNode midNode = getMid(start, end);
        TreeNode root = new TreeNode(midNode.val);
        root.left = build(start, midNode);
        root.right = build(midNode.next, end);
        return root;
    }

    //获取指针的中点
    private ListNode getMid(ListNode start, ListNode end) {
        ListNode slow = start, fast = start;

        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
