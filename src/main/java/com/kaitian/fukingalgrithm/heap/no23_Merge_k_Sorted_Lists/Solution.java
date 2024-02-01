package com.kaitian.fukingalgrithm.heap.no23_Merge_k_Sorted_Lists;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

import java.util.PriorityQueue;

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> {
            return a.val - b.val;
        });

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        while (!pq.isEmpty()) {
            ListNode head = pq.poll();
            p.next = head;

            if (head.next != null) {
                pq.add(head.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}
