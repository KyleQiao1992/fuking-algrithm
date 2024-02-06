package com.kaitian.fukingalgrithm.queue.no347_Top_K_Frequent_Elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    private Map<Integer, Integer> valFreMap = new HashMap<>();

    public int[] topKFrequent(int[] nums, int k) {
        mapBuilder(nums);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
            return a.getValue().compareTo(b.getValue());
        });

        for (Map.Entry<Integer, Integer> entry : valFreMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll().getKey();
        }
        return res;
    }

    private void mapBuilder(int[] nums) {
        for (int num : nums) {
            valFreMap.put(num, valFreMap.getOrDefault(num, 0) + 1);
        }
    }
}
