package com.kaitian.fukingalgrithm.heap.no379_Design_Phone_Directory;

import java.util.*;

public class Solution {
    class PhoneDirectory {
        private Queue<Integer> availableQueue;
        private Set<Integer> availableSet;

        public PhoneDirectory(int maxNumbers) {
            availableQueue = new ArrayDeque<Integer>();
            availableSet = new HashSet<Integer>();
            for (int i = 0; i < maxNumbers; i++) {
                availableQueue.offer(i);
                availableSet.add(i);
            }
        }

        public int get() {
            if (!availableQueue.isEmpty()) {
                int number = availableQueue.poll();
                availableSet.remove(number);
                return number;
            } else {
                return -1;
            }
        }

        public boolean check(int number) {
            return availableSet.contains(number);
        }

        public void release(int number) {
            if (!check(number)) {
                availableQueue.offer(number);
                availableSet.add(number);
            }
        }

    }
}
