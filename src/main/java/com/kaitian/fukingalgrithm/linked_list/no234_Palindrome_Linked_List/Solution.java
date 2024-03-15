package com.kaitian.fukingalgrithm.linked_list.no234_Palindrome_Linked_List;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }

        ListNode left = head;
        ListNode right = revertLinkedList(slow);

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    private ListNode revertLinkedList(ListNode head) {
        ListNode temp;
        ListNode cur = head, pre = null;

        while (cur != null) {
            temp = cur.next;
            cur.next = pre;

            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
