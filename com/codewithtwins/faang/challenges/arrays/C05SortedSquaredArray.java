package com.codewithtwins.faang.challenges.arrays;

import java.util.Arrays;

public class C05SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        //return Arrays.stream(array).map(x -> x*x).sorted().toArray(); stream solution
        int[] sortedSquares = new int[array.length];
        int smallerValueIdx = 0;
        int largerValueIdx = array.length -1;
        for(int idx = array.length -1 ; idx >= 0; idx--) {
            int smallerValue = array[smallerValueIdx];
            int largerValue = array[largerValueIdx];
            if(Math.abs(smallerValue) > Math.abs(largerValue)) {
                sortedSquares[idx] = smallerValue * smallerValue;
                smallerValueIdx++;
            } else {
                sortedSquares[idx] = largerValue * largerValue;
                largerValueIdx--;
            }
        }
        return sortedSquares;
    }
}
