package com.kaitian.fukingalgrithm.linked_list.j22_getKthFromEnd;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p1 = head;

        //p1走k
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }

        //再走n-k
        ListNode p2 = head;
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }
}
