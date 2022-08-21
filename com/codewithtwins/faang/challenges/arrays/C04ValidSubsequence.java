package com.codewithtwins.faang.challenges.arrays;

import java.util.*;

class C04ValidSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;
        for(int value : array) {
            if(seqIdx == sequence.size()) {
                break;
            }
            if(sequence.get(seqIdx).equals(value)) {
                seqIdx++;
            }
        }
        return seqIdx == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(new Integer[] {5, 1, 22, 25, 6, -1, 8, 10});
        List<Integer> sequence = Arrays.asList(new Integer[] {5, 1, 22, 6, -1, 8, 10});
        boolean result = isValidSubsequence(array, sequence);
        System.out.println(result);
    }
}

