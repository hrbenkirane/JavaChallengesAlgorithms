package com.codewithtwins.faang.challenges;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class C01TwoSum {
    public int[] solution(int[] A, int N) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Integer currentMapVal = numsMap.getOrDefault(A[i], null);
            if(currentMapVal != null) {
                return new int[] {currentMapVal, i};
            } else {
                numsMap.put(N-A[i], i);
            }

        }
        return null;
    }

    public static void main(String[] args) {
        C01TwoSum twoSum = new C01TwoSum();
        int[] solution = twoSum.solution(new int[]{1, 3, 7, 9, 2}, 11);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
    }
}
