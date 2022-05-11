package com.codewithtwins.faang.challenges.stacksqueues;

import java.util.Stack;

public class QueueWithStacks {

    Stack<Integer> in;
    Stack<Integer> out;

    public QueueWithStacks(Stack<Integer> in, Stack<Integer> out) {
        this.in = in;
        this.out = out;
    }

    public void enqueue(int val) {
        this.in.push(val);
    }

    public Integer dequeue(int val) {
        if(this.out.size()  == 0) {
            while(this.in.size() != 0) {
                this.out.push(this.in.pop());
            }
        }
        return this.out.pop();
    }

    public Integer peek() {
        if(this.out.size() == 0) {
            while(this.in.size() != 0) {
                this.out.push(this.in.pop());
            }
        }
        return this.out.lastElement();
    }

    public boolean isEmpty() {
        return this.in.isEmpty() && this.out.isEmpty();
    }
}
