package com.kaitian.fukingalgrithm.demo;

import com.kaitian.fukingalgrithm.array._prefix_array.no560_Subarray_Sum_Equals_K.Solution;
import com.kaitian.fukingalgrithm.linked_list.ListNode;
import com.kaitian.fukingalgrithm.tree.TreeNode;

import java.util.*;

public class Test {

    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        for (int i = slow + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Test f = new Test();
//        f.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
}
