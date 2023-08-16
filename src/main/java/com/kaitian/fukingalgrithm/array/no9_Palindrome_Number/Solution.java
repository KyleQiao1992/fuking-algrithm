package com.kaitian.fukingalgrithm.array.no9_Palindrome_Number;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        List<Integer> array = new ArrayList<>();
        while (x > 0) {
            int s = x % 10;
            array.add(s);
            x = x / 10;
        }

        int i = 0, j = array.size() - 1;

        while (i < j) {
            if (!array.get(i).equals(array.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
