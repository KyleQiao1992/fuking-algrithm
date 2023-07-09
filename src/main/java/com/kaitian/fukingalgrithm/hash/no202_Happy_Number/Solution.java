package com.kaitian.fukingalgrithm.hash.no202_Happy_Number;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private Set<Integer> res = new HashSet<>();

    public boolean isHappy(int n) {

        int originNum = n;
        while (true) {
            int sum = 0;

            while (n != 0) {
                int surplus = n % 10;
                n = n / 10;
                sum += surplus * surplus;
            }

            if (sum == 1) {
                return true;
            }
            if (res.contains(sum)) {
                return false;
            }
            res.add(originNum);
            originNum = sum;
            n = sum;
        }
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.isHappy(3);
    }
}
