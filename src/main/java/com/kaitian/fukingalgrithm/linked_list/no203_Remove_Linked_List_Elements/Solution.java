package com.kaitian.fukingalgrithm.linked_list.no203_Remove_Linked_List_Elements;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }

}
