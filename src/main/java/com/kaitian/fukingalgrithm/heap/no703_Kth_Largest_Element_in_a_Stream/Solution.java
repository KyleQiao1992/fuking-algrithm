package com.kaitian.fukingalgrithm.heap.no703_Kth_Largest_Element_in_a_Stream;

import java.util.PriorityQueue;

public class Solution {

    class KthLargest {

        private PriorityQueue<Integer> pq = new PriorityQueue<>();
        private int k = 0;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            for (int num : nums) {
                pq.offer(num);

                if (pq.size() > k) {
                    pq.poll();
                }
            }
        }

        public int add(int val) {
            pq.offer(val);

            if (pq.size() > k) {
                pq.poll();
            }
            return pq.peek();
        }
    }
}
