package com.codewithtwins.codility.challenges.sorting;

import java.util.HashSet;

public class C15Distinct {

    public int solution(int [] A ) {
        HashSet<Integer> h = new HashSet<>();
        for(int a : A) {
            h.add(a);
        }
        return h.size();
    }

    public static void main(String[] args) {
        C15Distinct d = new C15Distinct();
        System.out.println(d.solution(new int[] {1, 2, 3, 1, 2, 3}));
    }
}
