package com.kaitian.fukingalgrithm.linked_list.no142_Linked_List_Cycle_II;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode detectCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
