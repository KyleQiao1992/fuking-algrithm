package com.kaitian.fukingalgrithm.linked_list.no876_Middle_of_the_Linked_List;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
