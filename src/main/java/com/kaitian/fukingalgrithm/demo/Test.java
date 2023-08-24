package com.kaitian.fukingalgrithm.demo;

import com.kaitian.fukingalgrithm.linked_list.ListNode;
import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.*;

public class Test {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;
        whlie (p1 != null & p2 != null) {
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
        return dummy.next;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, null, 4, 5, 6};
        TreeNode node = TreeNode.constructTree(nums);
        Test f = new Test();
//        f.findBottomLeftValue(node);
    }
}
