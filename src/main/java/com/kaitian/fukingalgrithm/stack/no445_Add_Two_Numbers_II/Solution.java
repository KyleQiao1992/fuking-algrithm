package com.kaitian.fukingalgrithm.stack.no445_Add_Two_Numbers_II;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();

        ListNode p1 = l1, p2 = l2;

        while (p1 != null) {
            stack1.push(p1.val);
            p1 = p1.next;
        }
        while (p2 != null) {
            stack2.push(p2.val);
            p2 = p2.next;
        }
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
            int val = carry;

            if (!stack1.isEmpty()) {
                val += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                val += stack2.pop();
            }

            carry = val / 10;
            val = val % 10;

            ListNode newNode = new ListNode(val);
            newNode.next = dummyHead.next;
            dummyHead.next = newNode;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums1 = {7, 2, 4, 3};
        int[] nums2 = {5, 6, 4};
        f.addTwoNumbers(ListNode.build(nums1), ListNode.build(nums2));
    }
}
