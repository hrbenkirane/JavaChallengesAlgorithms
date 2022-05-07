package com.codewithtwins.codility.challenges;

// Given an array A of N integers, returns the smallest positive integer that does not occur in A
// for examples given A=[1,3,6,4,1,2] the function should return 5
// Given A=[1,2,3], the function should return 4.
// Given A=[-1, -3], the function should return 1.

import java.util.HashSet;
public class C09MissingInteger {

    public int solution(int[] A) {
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 1; i < A.length+1; i++) {
            nums.add(i);

        }
        for(int a : A) {
            nums.remove(Integer.valueOf(a));
        }
        return nums.iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(new C09MissingInteger().solution(new int[] {1, 3, 6, 4, 1, 2}));
    }

}
