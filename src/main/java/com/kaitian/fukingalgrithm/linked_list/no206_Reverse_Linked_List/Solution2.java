package com.kaitian.fukingalgrithm.linked_list.no206_Reverse_Linked_List;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution2 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
