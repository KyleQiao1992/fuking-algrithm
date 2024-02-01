package com.kaitian.fukingalgrithm.heap.no378_Kth_Smallest_Element_in_a_Sorted_Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> res = new ArrayList<>();

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return a[0] - b[0];
        });

        for (int i = 0; i < matrix.length; i++) {
            pq.offer(new int[]{matrix[0][i], 0, i});
        }
        int length = matrix.length;
        int width = matrix[0].length;

        while (!pq.isEmpty() && k > 0) {
            int[] nums = pq.poll();
            res.add(nums[0]);
            int curL = nums[1];
            int curW = nums[2];

            if (curL + 1 < length) {
                pq.offer(new int[]{matrix[curL + 1][curW], curL + 1, curW});
            }
        }

        return res.get(k - 1);
    }

    public static void main(String[] args) {
        Solution f = new Solution();

        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        f.kthSmallest(matrix, 8);
    }
}
