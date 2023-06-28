package com.kaitian.fukingalgrithm.linked_list.no21_Merge_Two_Sorted_Lists;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;

        while (p1 != null && p2 != null) {
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] num1 = {1, 2, 3};
        int[] num2 = {1, 3, 4};
        ListNode a = ListNode.build(num1);
        ListNode b = ListNode.build(num2);

        f.mergeTwoLists(a, b);
    }

}

