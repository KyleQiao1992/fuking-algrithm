package com.kaitian.fukingalgrithm.linked_list.no86_Partition_List;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution {

    public ListNode partition(ListNode head, int x) {
        ListNode lessThanList = new ListNode(-1);
        ListNode moreThanList = new ListNode(-1);

        ListNode p = head, p1 = lessThanList, p2 = moreThanList;

        while (p != null) {
            if (p.val >= x) {
                p2.next = new ListNode(p.val);
                p2 = p2.next;
            } else {
                p1.next = new ListNode(p.val);
                p1 = p1.next;
            }
            p = p.next;
        }

        p1.next = moreThanList.next;
        return lessThanList.next;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nus = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNode.build(nus);
        f.partition(node, 3);
    }
}
