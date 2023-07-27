package com.kaitian.fukingalgrithm.queue.no346_Moving_Average_from_Data_Stream;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private int maxSize, queueSum = 0;
    private Queue<Integer> queue = new LinkedList<>();

    public MovingAverage(int size) {
        maxSize = size;
    }

    public double next(int val) {
        if (queue.size() == maxSize) {
            int deleteVal = queue.poll();
            queueSum -= deleteVal;
        }
        queue.offer(val);
        queueSum += val;
        return (double) queueSum / queue.size();
    }
}
