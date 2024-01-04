package com.kaitian.fukingalgrithm.array._window.no904_Fruit_Into_Baskets;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int res = 0;
        Map<Integer, Integer> window = new HashMap<>();

        while (r < fruits.length) {
            int cR = fruits[r];
            window.put(cR, window.getOrDefault(cR, 0) + 1);
            r++;

            while (window.size() > 2) {
                int cL = fruits[l];
                window.put(cL, window.get(cL) - 1);
                if (window.get(cL) == 0) {
                    window.remove(cL);
                }
                l++;
            }
            res = Math.max(res, r - l);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.totalFruit(new int[]{1, 2, 3, 2, 2});
    }
}
