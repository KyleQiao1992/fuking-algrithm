package com.kaitian.fukingalgrithm.hash.no2215_Find_the_Difference_of_Two_Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (Integer num1 : set1) {
            if (set2.contains(num1)) {
                continue;
            }
            list1.add(num1);
        }
        for (Integer num2 : set2) {
            if (set1.contains(num2)) {
                continue;
            }
            list2.add(num2);
        }

        res.add(list1);
        res.add(list2);
        return res;
    }
}
