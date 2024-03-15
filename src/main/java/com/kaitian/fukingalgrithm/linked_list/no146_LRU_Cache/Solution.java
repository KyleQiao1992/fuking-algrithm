package com.kaitian.fukingalgrithm.linked_list.no146_LRU_Cache;

import java.util.LinkedHashMap;

public class Solution {

    class LRUCache {
        int capicity;
        private LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            this.capicity = capacity;
        }

        public int get(int key) {
            if (!cache.containsKey(key)) {
                return -1;
            }
            makeRecently(key);
            return cache.get(key);
        }

        private void makeRecently(int key) {
            int val = cache.get(key);
            cache.remove(key);
            cache.put(key, val);
        }

        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                cache.put(key, value);
                makeRecently(key);
                return;
            }

            if (cache.size() >= this.capicity) {
                int oldestKey = cache.keySet().iterator().next();
                cache.remove(oldestKey);
            }
            cache.put(key, value);
        }
    }
}
