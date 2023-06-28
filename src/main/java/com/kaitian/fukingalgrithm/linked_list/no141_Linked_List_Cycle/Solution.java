package com.kaitian.fukingalgrithm.linked_list.no141_Linked_List_Cycle;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {


    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
