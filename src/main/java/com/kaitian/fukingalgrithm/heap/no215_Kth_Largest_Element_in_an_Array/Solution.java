package com.kaitian.fukingalgrithm.heap.no215_Kth_Largest_Element_in_an_Array;

import java.util.PriorityQueue;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int e : nums) {
            pq.offer(e);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] nums = {3, 2, 1, 5, 6, 4};
        f.findKthLargest(nums, 2);
    }
}
