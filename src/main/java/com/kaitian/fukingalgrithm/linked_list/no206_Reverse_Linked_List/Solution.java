package com.kaitian.fukingalgrithm.linked_list.no206_Reverse_Linked_List;


import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    private ListNode res = new ListNode(-1);
    private ListNode p = res;

    public ListNode reverseList(ListNode head) {
        traverse(head);
        return res.next;
    }

    private void traverse(ListNode head) {
        if (head == null) {
            return;
        }

        traverse(head.next);
        p.next = new ListNode(head.val) ;
        p = p.next;
    }
}
