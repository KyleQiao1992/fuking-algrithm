package com.kaitian.fukingalgrithm.linked_list.no86_Partition_List;

import com.kaitian.fukingalgrithm.linked_list.ListNode;

public class Solution2 {

    ListNode partition(ListNode head, int x) {
        ListNode lessThanList = new ListNode(-1);
        ListNode moreThanList = new ListNode(-1);

        ListNode p1 = lessThanList, p2 = moreThanList;

        ListNode p = head;
        while (p != null) {
            if (p.val >= x) {
                p2.next = p;
                p2 = p2.next;
            } else {
                p1.next = p;
                p1 = p1.next;
            }

            // 断开原链表中的每个节点的 next 指针
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }

        p1.next = moreThanList.next;
        return moreThanList.next;
    }

    public static void main(String[] args) {
        Solution2 f = new Solution2();
        int[] nus = {1, 4, 3, 2, 5, 2};
        ListNode node = ListNode.build(nus);
        f.partition(node, 3);
    }
}
