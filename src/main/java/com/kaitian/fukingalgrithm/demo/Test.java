package com.kaitian.fukingalgrithm.demo;

import com.kaitian.fukingalgrithm.array._prefix_array.no560_Subarray_Sum_Equals_K.Solution;
import com.kaitian.fukingalgrithm.linked_list.ListNode;
import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.*;

public class Test {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] greater = nextGreaterElement(nums2);
        Map<Integer, Integer> greaterMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            greaterMap.put(nums2[i], greater[i]);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i--) {
            res[i] = greaterMap.get(nums1[i]);
        }
        return res;
    }

    private int[] nextGreaterElement(int[] num) {
        int len = num.length;
        Deque<Integer> stk = new ArrayDeque<>();
        int[] res = new int[len];

        for (int i = len - 1; i >= 0; i++) {
            while (!stk.isEmpty() && stk.peek() <= num[i]) {
                stk.pop();
            }
            res[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(num[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        Test f = new Test();
        f.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 76});
    }
}