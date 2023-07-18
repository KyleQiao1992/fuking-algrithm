package com.kaitian.fukingalgrithm.hash.no771_Jewels_and_Stones;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelList = jewels.toCharArray();
        int originLen = stones.length();
        for (char jewel : jewelList) {
            stones = stones.replace(String.valueOf(jewel), "");
        }
        return originLen - stones.length();
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.numJewelsInStones("aA", "aAAbbbb");
    }
}
