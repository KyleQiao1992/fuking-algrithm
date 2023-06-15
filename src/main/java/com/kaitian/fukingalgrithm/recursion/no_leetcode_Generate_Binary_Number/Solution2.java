package com.kaitian.fukingalgrithm.recursion.no_leetcode_Generate_Binary_Number;

public class Solution2 {

    private static StringBuilder path = new StringBuilder();

    public void generateBinaryNumber(int n) {
        if (n == 0) {
            System.out.println(path.toString());
            return;
        }

        for (int i = 0; i < 2; i++) {
            path.append(i);
            generateBinaryNumber(n - 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
