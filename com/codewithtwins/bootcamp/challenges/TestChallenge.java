package com.codewithtwins.bootcamp.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestChallenge {
    public int solution(int[] A) {
       HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            int element = A[i];
            if(set.contains(element)) {
                set.remove(element);
            } else {
                set.add(element);
            }
        }

        return set.iterator().next();

    }

    public static void main(String[] args) {
        System.out.println(new TestChallenge().solution(new int[] {9,3,9,3,9,7,9}));

    }
}
