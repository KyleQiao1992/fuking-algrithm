package com.kaitian.fukingalgrithm.linked_list.no83_Remove_Duplicates_from_Sorted_List;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;

        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }

        slow.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3};
        ListNode node = ListNode.build(nums);
        Solution f = new Solution();
        f.deleteDuplicates(node);
    }
}
