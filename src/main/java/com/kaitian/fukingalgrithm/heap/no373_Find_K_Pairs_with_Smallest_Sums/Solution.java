package com.kaitian.fukingalgrithm.heap.no373_Find_K_Pairs_with_Smallest_Sums;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return (a[0] + a[1]) - (b[0] + b[1]);
        });

        //idx[0]=num1[0], idx[1]=num2[1], idx[2]= 下一个的索引
        for (int i = 0; i < nums1.length; i++) {
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }

        while (!pq.isEmpty() && k > 0) {
            int[] cur = pq.poll();
            k--;
            int nextIdx = cur[2] + 1;
            if (nextIdx < nums2.length) {
                pq.offer(new int[]{cur[0], nums2[nextIdx], nextIdx});
            }
            List<Integer> pair = new ArrayList<>();
            pair.add(cur[0]);
            pair.add(cur[1]);

            res.add(pair);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        int[] num1 = {1, 7};
        int[] num2 = {2, 4, 6};
        f.kSmallestPairs(num1, num2, 3);
    }
}
