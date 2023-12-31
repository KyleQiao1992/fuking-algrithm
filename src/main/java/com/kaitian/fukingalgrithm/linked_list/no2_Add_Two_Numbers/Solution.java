package com.kaitian.fukingalgrithm.linked_list.no2_Add_Two_Numbers;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        int carry = 0;

        while (p1 != null || p2 != null || carry > 0) {
            int val = carry;
            if (p1 != null) {
                val += p1.val;
                p1 = p1.next;
            }

            if (p2 != null) {
                val += p2.val;
                p2 = p2.next;
            }

            carry = val / 10;
            val = val % 10;
            p.next = new ListNode(val);
            p = p.next;
        }

        return dummy.next;
    }
}
