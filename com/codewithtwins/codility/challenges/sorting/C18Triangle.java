package com.codewithtwins.codility.challenges.sorting;

import java.util.Arrays;

public class C18Triangle {

    public int solution(int[] A) {
        if(A.length < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length -2; i++) {
            if((long)A[i] + A[i+1] > A[i+2]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new C18Triangle().solution(new int[] {10, 2, 5, 1, 8, 20}));

    }
}
