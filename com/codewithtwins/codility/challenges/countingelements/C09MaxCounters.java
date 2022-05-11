package com.codewithtwins.codility.challenges.countingelements;

public class C09MaxCounters {

    public int[] solution(int N, int[] A) {

        int maxValue = 0;
        int minValue = 0;

        int[] counters = new int[N];

        for (int i = 0; i < A.length; i++) {
            int operation = A[i];
            if(operation == N+1) {
                // Max Value Operation
//                for(int j= 0; j < counters.length; j++) {
//                    counters[j] = maxValue;
//                }
                minValue = maxValue;
            } else {
                // Increment Operation
                operation--;
                counters[operation] = Math.max(counters[operation] + 1, minValue + 1);
                maxValue = Math.max(maxValue, counters[operation]);
            }
        }
        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], minValue);
        }
        return counters;
    }

    public static void main(String[] args) {
        C09MaxCounters mc = new C09MaxCounters();
        int[] result = mc.solution(5, new int[] {3,4,4,6,1,4,4});
        for (int i : result) {
            System.out.println(i);
        }
    }


}
