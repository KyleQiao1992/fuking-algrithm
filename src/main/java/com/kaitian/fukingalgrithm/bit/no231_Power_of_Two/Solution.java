package com.kaitian.fukingalgrithm.bit.no231_Power_of_Two;

//判断一个数是不是2的指数

//一个数如果是 2 的指数，那么它的二进制表示一定只含有一个 1
public class Solution {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
}
