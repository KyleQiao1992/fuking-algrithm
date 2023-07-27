package com.kaitian.fukingalgrithm.queue.no362_Design_Hit_Counter;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {

    private Queue<Integer> q = new LinkedList<>();

    public HitCounter() {

    }

    public void hit(int timestamp) {
        q.offer(timestamp);
    }

    public int getHits(int timestamp) {
        while (!q.isEmpty() && timestamp - q.peek() >= 300) {
            q.poll();
        }
        return q.size();
    }
}
