package com.kaitian.fukingalgrithm.queue.no225_Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue = new LinkedList<>();
    private int topE;

    public MyStack() {

    }

    public void push(int x) {
        queue.offer(x);
        this.topE = x;
    }

    public int pop() {
        int size = queue.size();
        while (size > 2) {
            queue.offer(queue.poll());
            size--;
        }
        topE = queue.peek();
        queue.offer(queue.poll());
        return queue.poll();
    }

    public int top() {
        return topE;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
