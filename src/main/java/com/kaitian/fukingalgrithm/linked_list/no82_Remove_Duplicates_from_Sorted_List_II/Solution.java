package com.kaitian.fukingalgrithm.linked_list.no82_Remove_Duplicates_from_Sorted_List_II;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode p = dummyHead, q = head;

        while (q != null) {
            if (q.next != null && q.val == q.next.val) {
                while (q.next != null && q.val == q.next.val) {
                    q = q.next;
                }
                q = q.next;
                if (q == null) {
                    p.next = null;
                }

            } else {
                p.next = q;
                p = p.next;
                q = q.next;
            }
        }

        return dummyHead.next;
    }


    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums = {1, 2, 3, 3, 4, 4, 5};
        ListNode node = ListNode.build(nums);
        f.deleteDuplicates(node);
    }
}
