package com.kaitian.fukingalgrithm.linked_list.no206_Reverse_Linked_List;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution3 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
