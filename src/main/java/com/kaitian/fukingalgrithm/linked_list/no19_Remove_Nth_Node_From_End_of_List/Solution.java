package com.kaitian.fukingalgrithm.linked_list.no19_Remove_Nth_Node_From_End_of_List;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        //先找到倒数第n+1个节点
        ListNode x = getKthFromEnd(dummy, n + 1);

        x.next = x.next.next;
        return dummy.next;
    }

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
