package com.codewithtwins.bootcamp.challenges;

import java.util.Arrays;
import java.util.Collections;

public class NumberOfCars {
    public int solution(int[] P, int[] S) {
        int p = Arrays.stream(P).sum();
        Integer[] SArr = Arrays.stream(S).boxed().toArray(Integer[]::new); // convert int[] to Integer[]
        Arrays.sort(SArr, Collections.reverseOrder());
        int index = 0;
        while(p > 0) {
            p = p - SArr[index];
            index += 1;
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfCars().solution(new int[] {1,4,1}, new int[] {1,5,1}));
        System.out.println(new NumberOfCars().solution(new int[] {4,4,5,3}, new int[] {5,5,7,3}));
    }
}
