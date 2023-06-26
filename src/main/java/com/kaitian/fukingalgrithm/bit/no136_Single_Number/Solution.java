package com.kaitian.fukingalgrithm.bit.no136_Single_Number;

//找出数组中只出现一次的数字

//一个数和它本身做异或运算结果为 0，即 a ^ a = 0；
// 一个数和 0 做异或运算的结果为它本身，即 a ^ 0 = a。
public class Solution {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        return res;
    }
}
