package com.kaitian.fukingalgrithm.sort.merge_sort.no315_Count_of_Smaller_Numbers_After_Self;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    private Pair[] temp;
    public int[] count;

    private class Pair {
        int val;
        int id;

        public Pair(int val, int id) {
            this.val = val;
            this.id = id;
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        temp = new Pair[n];
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }
        sort(arr, 0, n - 1);
        List<Integer> res = new LinkedList<>();
        for (int c : count) {
            res.add(c);
        }
        return res;
    }

    private void sort(Pair[] arr, int low, int high) {
        if (low == high) {
            return;
        }

        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(Pair[] arr, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low;
        int j = mid + 1;

        for (int p = low; p <= high; p++) {
            if (i == mid + 1) {
                arr[p] = temp[j++];
            } else if (j == high + 1) {
                arr[p] = temp[i++];
                count[arr[p].id] += j - mid - 1;
            } else if (temp[i].val > temp[j].val) {
                arr[p] = temp[j++];
            } else {
                arr[p] = temp[i++];
                count[arr[p].id] += j - mid - 1;
            }
        }
    }
}
