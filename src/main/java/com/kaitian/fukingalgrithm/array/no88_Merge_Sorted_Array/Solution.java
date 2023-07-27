package com.kaitian.fukingalgrithm.array.no88_Merge_Sorted_Array;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 逆序由后向前添加
        int p1 = m - 1, p2 = n - 1;

        for (int i = nums1.length - 1; i >= 0; i--) {
            if (p1 == -1) {
                nums1[i] = nums2[p2--];
                continue;
            } else if (p2 == -1) {
                return;
            }

            if (nums1[p1] >= nums2[p2]) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.merge(new int[]{2, 0}, 1, new int[]{1}, 1);
    }
}
