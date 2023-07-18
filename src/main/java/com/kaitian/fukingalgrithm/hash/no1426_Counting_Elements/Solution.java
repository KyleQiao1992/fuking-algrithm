package com.kaitian.fukingalgrithm.hash.no1426_Counting_Elements;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int countElements(int[] arr) {
        int[] ints = new int[1002];
        for (int num : arr) ints[num]++;
        int ans = 0;
        for (int num : arr) {
            if (ints[num + 1] != 0) ans++;
        }
        return ans;
    }
}
