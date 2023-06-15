package com.kaitian.fukingalgrithm.dp.no118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> preRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> nextRow = generateNextRow(i, preRow);
            res.add(nextRow);
            preRow = nextRow;
        }
        return res;
    }

    private List<Integer> generateNextRow(int numRows, List<Integer> preRow) {
        //base
        if (numRows == 0) {
            return Arrays.asList(1);
        }
        if (numRows == 1) {
            return Arrays.asList(1, 1);
        }

        List<Integer> res = new ArrayList<>();
        res.add(1);

        for (int i = 0; i < preRow.size() - 1; i++) {
            res.add(preRow.get(i) + preRow.get(i + 1));
        }

        res.add(1);
        return res;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        List<List<Integer>> res = f.generate(5);
    }

}
