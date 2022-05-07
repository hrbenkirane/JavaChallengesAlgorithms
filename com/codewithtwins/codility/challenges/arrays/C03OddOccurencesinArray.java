package com.codewithtwins.codility.challenges.arrays;

import java.util.HashSet;

public class C03OddOccurencesinArray {
    HashSet<Integer> aList = new HashSet<>();

    public int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if(aList.contains(a)) {
                aList.remove(new Integer(a));
            } else {
                aList.add(a);
            }
        }
        return aList.iterator().next();
    }

    public static void main(String[] args) {
        C03OddOccurencesinArray ooia = new C03OddOccurencesinArray();
        ooia.solution(new int[] {9,3,9,3,9,7,9});
    }
}
