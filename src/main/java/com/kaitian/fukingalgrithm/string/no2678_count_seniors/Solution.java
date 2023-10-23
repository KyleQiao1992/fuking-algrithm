package com.kaitian.fukingalgrithm.string.no2678_count_seniors;

public class Solution {

    public int countSeniors(String[] details) {
        int count = 0;
        for (String info : details) {
            if (Integer.parseInt(info.substring(11, 13)) > 60) {
                count++;
            }
        }
        return count;
    }

}
