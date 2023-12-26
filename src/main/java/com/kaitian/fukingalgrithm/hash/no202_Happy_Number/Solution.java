package com.kaitian.fukingalgrithm.hash.no202_Happy_Number;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        int res = 0;
        while (true) {

            int num = n % 10;
            res += num * num;
            n = n / 10;
            if (n == 0) {
                if (res == 1) {
                    return true;
                }
                if (set.contains(res)) {
                    return false;
                }
                set.add(res);
                n = res;
                res = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.isHappy(19);
    }
}
