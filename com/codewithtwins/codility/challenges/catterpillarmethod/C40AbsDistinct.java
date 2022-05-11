package com.codewithtwins.codility.challenges.catterpillarmethod;

import java.util.HashSet;

public class C40AbsDistinct {
    public int solution(int[] A) {
        HashSet<Long> distinctValues = new HashSet<>();
        int count = 0;
        for (int a : A) {
            if(distinctValues.contains(Math.abs((long)a))) {

            } else {
                distinctValues.add(Math.abs((long)a));
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new C40AbsDistinct().solution(new int[] {-5, -3, -1, 0, 3, 6}));
    }
}
