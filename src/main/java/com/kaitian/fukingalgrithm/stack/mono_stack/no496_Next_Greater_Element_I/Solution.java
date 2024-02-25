package com.kaitian.fukingalgrithm.stack.mono_stack.no496_Next_Greater_Element_I;

import java.util.*;

public class Solution {
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
}
