package com.codewithtwins.codility.challenges.leader;

import java.util.HashMap;
import java.util.Map;

public class C23Dominator {

    public int solution( int[] A) {
        Map<Integer, Integer> counters = new HashMap<>();
        for (int i=0; i< A.length; i++) {
            int a = A[i];
            if(!counters.containsKey(a)) {
                counters.put(a, 1);
            } else {
                counters.put(a, counters.get(a) + 1);
            }
            if(counters.get(a) > A.length/2) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new C23Dominator().solution(new int[] {3, 3, 1 ,2 ,3}) );
    }



}
