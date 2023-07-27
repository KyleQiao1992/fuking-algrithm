package com.kaitian.fukingalgrithm.queue.no933_Number_of_Recent_Calls;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    private Queue<Integer> q = new LinkedList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}
