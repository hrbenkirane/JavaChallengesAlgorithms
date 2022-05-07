package com.codewithtwins.codility.challenges.stacksandqueues;

import java.util.Stack;

public class C22StoneWall {

    public int solution(int[] H) {
        Stack<Integer> stack = new Stack();

        int blockCount = 0;

        for(int h : H) {
            while(!stack.isEmpty() && stack.peek() > h) {
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek() == h) {

            } else {
                stack.push(h);
                blockCount++;
            }
        }
        return blockCount;
    }

    public static void main(String[] args) {
        System.out.println(new C22StoneWall().solution(new int[] {8,8,5,7,9,8,7,4,8}));
    }
}
