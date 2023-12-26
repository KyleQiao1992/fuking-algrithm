package com.kaitian.fukingalgrithm.hash.no349_Intersection_of_Two_Arrays;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> res = new HashSet<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                res.add(num);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
