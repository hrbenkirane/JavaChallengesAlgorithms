package com.codewithtwins.codility.challenges.sieveoferatosthenes;

import java.util.HashMap;
import java.util.Map;

public class C32CountNonDivisible {
    public int[] solution(int[] A) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int a : A) {
            int c = 0;
            if(count.containsKey(a)) {
                c = count.get(a);
            }
            c++;
            count.put(a, c);
        }

        Map<Integer, Integer> divisorsCount = new HashMap<>();

        for(int n : count.keySet()) {

            int divisorCount = 0;

            for (int val = 1; val <= Math.sqrt(n); val++) {
                if(n % val == 0) {
                   if(count.containsKey(val)) {
                       divisorCount += count.get(val);
                   }
                   if(val < Math.sqrt(n)) {
                       int opp = n / val;
                       if(count.containsKey(opp)) {
                           divisorCount += count.get(opp);
                       }
                   }
                }
            }
            divisorsCount.put(n, divisorCount);
        }
        int[] nonDivisors = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            nonDivisors[i] = A.length - divisorsCount.get(A[i]);
        }

        return nonDivisors;
    }

    public static void main(String[] args) {
        C32CountNonDivisible cnd = new C32CountNonDivisible();
        int[] solution = cnd.solution(new int[]{3, 1, 2, 3, 6});
        for(int a : solution) {
            System.out.println(a);
        }
    }
}
