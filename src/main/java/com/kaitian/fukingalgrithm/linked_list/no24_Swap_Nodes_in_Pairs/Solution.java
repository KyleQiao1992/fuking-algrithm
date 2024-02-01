package com.kaitian.fukingalgrithm.linked_list.no24_Swap_Nodes_in_Pairs;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}
