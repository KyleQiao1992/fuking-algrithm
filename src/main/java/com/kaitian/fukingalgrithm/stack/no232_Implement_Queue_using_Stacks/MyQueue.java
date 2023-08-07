package com.kaitian.fukingalgrithm.stack.no232_Implement_Queue_using_Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {

    private Deque<Integer> stack1 = new ArrayDeque<>();
    private Deque<Integer> stack2 = new ArrayDeque<>();

    public MyQueue() {

    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        peek();
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
