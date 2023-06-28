package com.kaitian.fukingalgrithm.linked_list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode build(int[] nums) {
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        for (int num : nums) {
            p.next = new ListNode(num);
            p = p.next;
        }
        return dummyHead.next;
    }
}
