package com.kaitian.fukingalgrithm.bit.no191_Number_of_1_Bits;

//二进制中1的个数

//n&(n-1) 这个操作是算法中常见的，作用是消除数字 n 的二进制表示中的最后一个 1。
public class Solution {


    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

}
