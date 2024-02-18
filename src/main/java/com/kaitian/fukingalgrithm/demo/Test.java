package com.kaitian.fukingalgrithm.demo;

import com.kaitian.fukingalgrithm.array._prefix_array.no560_Subarray_Sum_Equals_K.Solution;
import com.kaitian.fukingalgrithm.linked_list.ListNode;
import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.*;

public class Test {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }

    public static void main(String[] args) {
        Test f = new Test();
//        f.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
    }
}
