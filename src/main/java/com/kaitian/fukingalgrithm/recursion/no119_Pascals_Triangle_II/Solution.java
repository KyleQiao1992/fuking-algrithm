package com.kaitian.fukingalgrithm.recursion.no119_Pascals_Triangle_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    //返回第N行的杨辉三角
    public List<Integer> getRow(int rowIndex) {
        //base case
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }
        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }

        List<Integer> thisRow = new ArrayList<>();
        thisRow.add(1);

        List<Integer> upRowList = getRow(rowIndex - 1);

        int i = 0;
        int j = i + 1;
        for (i = 0; j < upRowList.size(); i++, j++) {
            thisRow.add(upRowList.get(i) + upRowList.get(j));
        }

        thisRow.add(1);
        return thisRow;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        List<Integer> res = f.getRow(3);
    }
}
